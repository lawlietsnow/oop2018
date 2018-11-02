package week7.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        try{
            nullPointer();
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            outOfBound();
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            arithmeti();
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            cast();
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            iO();
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            fileNotFound();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static int nullPointer() throws NullPointerException{
        int a[] = null;
        return a[33];
    }
    public static int outOfBound() throws ArrayIndexOutOfBoundsException{
        int a[] = {1,1};
        return a[2];
    }
    public static void arithmeti() throws ArithmeticException{
        //throw new ArithmeticException();
        System.out.println(3/0);
    }
    public static void cast() throws ClassCastException{
        //throw new ClassCastException();
        Object a = new Integer(6);
        String s = (String) a;
    }
    public static void iO() throws IOException{
        //throw new IOException();
        File file=new File("fail.txt");
        BufferedReader bt= new BufferedReader(new FileReader(file));
    }
    public static void fileNotFound() throws FileNotFoundException{
        //throw new FileNotFoundException();
        File file=new File("fail.txt");
        BufferedReader bt= new BufferedReader(new FileReader(file));
    }
}

    



