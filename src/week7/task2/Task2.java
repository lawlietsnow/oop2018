package week7.task2;

import java.io.FileNotFoundException;
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
    public static void nullPointer() throws NullPointerException{
        throw new NullPointerException();
    }
    public static void outOfBound() throws ArrayIndexOutOfBoundsException{
        throw new ArrayIndexOutOfBoundsException();
    }
    public static void arithmeti() throws ArithmeticException{
        throw new ArithmeticException();
    }
    public static void cast() throws ClassCastException{
        throw new ClassCastException();
    }
    public static void iO() throws IOException{
        throw new IOException();
    }
    public static void fileNotFound() throws FileNotFoundException{
        throw new FileNotFoundException();
    }
}

    



