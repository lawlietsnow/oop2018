package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {

    public static String readContentFromFile(String path){
        String s="";
        try {
            BufferedReader breader= new BufferedReader(new FileReader(path));
            String str=breader.readLine();
            while(str!=null){
                s+="\n"+str;
                str=breader.readLine();
            }
            breader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return s;
    }
    public static void writeContentToFile(String path){
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(path));
            String s="Dong 1 sau khi ghi de\nDong 2 sau khi ghi de";
            bw.write(s);
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    } 
    public static void writeContentToFileWithoutOverriding(String path){
        
        try {
            File file= new File (path);
            FileWriter fw= new FileWriter(file.getName(),true);
            BufferedWriter bw=new BufferedWriter(fw);
            BufferedWriter b=new BufferedWriter(new FileWriter((new File(path).getName())));
            String s="\nThem vao cuoi\nThem vao cuoi 2";
            bw.write(s);
            bw.close();
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}

