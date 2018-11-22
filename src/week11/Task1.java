package week11;

public class Task1  {
    public <T> void swap(T[]arr,int i,int j){
        
    }
    public static <T extends Comparable> void sort(T[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])<0) {
                    T temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Integer[] b = {1, 2, 3,5,4};
        sort(b);
        for(int i=0;i<b.length;i++) System.out.println(b[i]);
        
    }
     
}
