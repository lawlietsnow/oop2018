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
    List<String> cutStr(String s){
        List<String> listName=new ArrayList<>();
        String str,s0="";
        int i;
        str=s.substring(s.indexOf('(')+1,s.indexOf(')'));
        for(i=0;i<str.length();i++){
            if(str.charAt(i)!=',') s0+=str.charAt(i);
            if(str.charAt(i)==','){
                listName.add(s0);
                s0="";
            }
        }
        for(i=str.length()-1;i>=0;i--) if(str.charAt(i)==',')break;
        listName.add(str.substring(i+1));
        return listName;
    }
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
                if(s.contains("static")){
                    n=0;
                    while(true){
                        if(s.indexOf('{')!=-1) n++;
                        if(s.indexOf('}')!=-1) n--;
                        str+=s+"\n";
                        if(n==0)break;
                        s=br.readLine();
                    }
                } else {
                }
                if(!"".equals(str)) list.add(str);
                s=br.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public String findFunctionByName(String name){
            String nameMethod;
            int i;
            int b=1,n=0;
            String s,s0="",str="",traVe="";
            BufferedReader br;
            ArrayList<String> listName=new ArrayList<>();
            nameMethod=name.substring(0, name.indexOf('('));
            s=name.substring(name.indexOf('(')+1, name.indexOf(')'));
            for(i=0;i<s.length();i++){
                if(s.charAt(i)!=',') s0+=s.charAt(i);
                
                if(s.charAt(i)==','){
                    listName.add(s0);
                    s0="";
                }
            }
            for(i=s.length()-1;i>=0;i--) if(s.charAt(i)==',')break;
            listName.add(s.substring(i+1));
        try {
            br=new BufferedReader(new FileReader("src\\week9\\Utils.java"));
            str=br.readLine();
            while(str!=null){
                if(str.contains(nameMethod)){
                    for(i=0;i<listName.size();i++) if(!str.contains(listName.get(i))) b=0;
                    while(true){
                        if(str.indexOf("{")!=-1) n++;
                        if(str.indexOf("}")!=-1) n--;
                        traVe+=str+"\n";
                        if(n==0)break;
                        str=br.readLine();
                    }
                }
                str=br.readLine();
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Task1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return traVe;
    }
    public static void main(String[] args) {
        File path=new File("src\\week9\\Utils.java");
        Task1 ex=new Task1();
        List<String> list=ex.getAllFunctions(path);
        System.out.println("size of list: "+list.size());
        for(int i=0;i<list.size();i++) System.out.print(list.get(i));
        ex.findFunctionByName("findFileByName(String,String)");
        System.out.println("************task2.2***********");
        System.out.println(ex.findFunctionByName("writeContentToFileWithoutOverriding(String,String,String,String)"));
        list=ex.cutStr("writeContentToFileWithoutOverriding(String)");
        for(int i=0;i<list.size();i++)System.out.println(list.get(i));
        System.out.println(list.size());
    }
}
