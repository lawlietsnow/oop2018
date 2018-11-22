package week11;

import java.util.ArrayList;

public class Task2 {
    public static <T extends Comparable > T max(ArrayList<T> list){
        T max=list.get(0);
        for(int i=1;i<list.size();i++){
            if(max.compareTo(list.get(i))<0) max=list.get(i);
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(new Integer(0));
        list.add(new Integer(0));
        list.add(new Integer(0));
        list.add(new Integer(0));
        list.add(new Integer(0));
        list.add(new Integer(0));
        list.add(new Integer(0));
        int a=max(list);
        System.out.println(a);
        
    }
    
}
