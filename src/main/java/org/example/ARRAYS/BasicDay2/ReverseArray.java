package org.example.ARRAYS.BasicDay2;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int ar1[]={1,2,3,4,5,6,7};
        int st=0;
        int end=ar1.length-1;
        System.out.println(Arrays.toString(ar1));
        while (st<end){
            int temp = ar1[st];
            ar1[st] = ar1[end];
            ar1[end] = temp;
            st++;
           end--;
        }
        System.out.println(Arrays.toString(ar1));
    }
}
