package org.example.ARRAYS.BasicDay2;

import java.util.Arrays;

public class NegativePositive {
    public static void main(String[] args) {
        int ar[] = {-10,20,-20,42,21,-15,24,12,-65,-20,75,38};
        int j=0;
        System.out.println("Before : "+Arrays.toString(ar));
        for(int i=0;i<ar.length;i++){
            if(ar[i]<0){
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                j++;
            }
        }
        System.out.println(" After : "+Arrays.toString(ar));
    }
}
