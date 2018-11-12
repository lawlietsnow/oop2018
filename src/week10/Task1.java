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
                if(s.indexOf("static")!=-1){
                    n=0;
                    while(true){
                        if(s.indexOf('{')!=-1) n++;
                        if(s.indexOf('}')!=-1) n--;
                        if(n==0)break;
                        str+="\n"+s;
                        s=br.readLine();
                    }
                }
                if(str!="") list.add(str);
                s=br.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    }
    public static void main(String[] args) {
        File path=new File("src\\week9\\Utils.java");
        Task1 ex=new Task1();
        List<String> list=ex.getAllFunctions(path);
        for(int i=0;i<list.size();i++) System.out.println(list.get(i)+"\n///////////");
    }
}
