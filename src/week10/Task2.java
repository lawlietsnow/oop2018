package week10;

import java.util.Random;

public class Task2 {
    public static void bubbleSort(){
        float[] a=new float[1000];
        Random random=new Random();
        int i,j;
        for(i=0;i<1000;i++){
            a[i]=random.nextFloat()+random.nextInt(1000);
        }
        for(i=0;i<999;i++){
            for(j=999;j>i;j--){
        	if(a[j]<a[j-1]) {
                	float t=a[j];
			a[j]=a[j-1];
			a[j-1]=t;
                    }
		}
	}
        for(i=0;i<1000;i++)System.out.println(a[i]);
    }
    public static void main(String[] args) {
        bubbleSort();
    }
}
