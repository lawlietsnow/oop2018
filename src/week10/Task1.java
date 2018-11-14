package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    final String single="//";
    final String multiOpen="/*";
    final String multiClose="*/";
    List<String>getAllFunctions(File path){
        List<String> list=new ArrayList<>();
        BufferedReader br;
        String s="";
        String str;
        int n;
        try {
            br=new BufferedReader(new FileReader(path));
            s=br.readLine();
            while(s!=null){
                str="";
                if(s.contains(single)) s=br.readLine();
                else if(s.contains(multiOpen)) {
                    while(!s.contains(multiClose)) s=br.readLine();
                }
                else{
                    if(s.contains("static")&&s.indexOf('(')!=-1&&s.indexOf(')')!=-1&&s.indexOf(';')==-1){
                    n=0;
                    while(true){
                        if(s.indexOf('{')!=-1) n++;
                        if(s.indexOf('}')!=-1) n--;
                        str+=s+"\n";
                        if(n==0)break;
                        s=br.readLine();
                    }
                } 
                if(!"".equals(str)) list.add(str);
                }
                s=br.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public List<String> cutStr(String s){
        List<String> listName=new ArrayList<>();
        int i;
        String str;
        str=s.substring(s.indexOf('(')+1, s.indexOf(')'));
        String s0="";
        for(i=0;i<str.length();i++){
            if(str.charAt(i)!=',') s0=s0+str.charAt(i);
            if(str.charAt(i)==',') {
                listName.add(s0);
                s0="";
            }
        }
        for(i=str.length()-1;i>=0;i--) if(str.charAt(i)==',')break;
            listName.add(str.substring(i+1));
        return listName;
    }
    public String findFunctionByName(String name){
            String nameMethod;
            int i;
            int n=0,t=0;
            String s,s0="",str="",traVe="";
            BufferedReader br;
            List<String> listName;
            List<String> listName1=null;
            nameMethod=name.substring(0, name.indexOf('('));
            listName=cutStr(name);
        try {
            br=new BufferedReader(new FileReader("src\\week9\\Utils.java"));
            str=br.readLine();
            while(str!=null){
                if(str.contains(single)) str=br.readLine();
                else if(str.contains(multiOpen)){
                    while(!str.contains(multiClose)) str=br.readLine();
                }
                else{
                    if(str.contains(nameMethod)){
                    listName1=cutStr(str);
                    if(listName1.size()==listName.size()){
                        t=1;
                        for(i=0;i<listName.size();i++) if(!listName1.get(i).contains(listName.get(i))) t=0;
                        
                    }
                }
                }
                if(t==1){
                    n=0;
                    while(true){
                        if(str.indexOf('{')!=-1) n++;
                        if(str.indexOf('}')!=-1) n--;
                        s0+=str+"\n";
                        if(n==0)break;
                        str=br.readLine();
                    }
                    break;
                }
                str=br.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s0;
    }
    public static void main(String[] args) {
        File path=new File("src\\week9\\Utils.java");
        Task1 ex=new Task1();
        List<String> list=ex.getAllFunctions(path);
        System.out.println("size of list: "+list.size());
        for(int i=0;i<list.size();i++) System.out.print(list.get(i));
        System.out.println("***********task 1.2*********");
        String s=ex.findFunctionByName("writeContentToFileWithoutOverriding(String,String)");
        System.out.println(s);
        
        
        
    }
}
