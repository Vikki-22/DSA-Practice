package org.example.ARRAYS.BasicDay1;

import java.util.Scanner;

public class AvgAndMean {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array..");
//        int size=sc.nextInt();
        int arr[]=new int[ sc.nextInt()];
        float sum=0;
        for(int i =0; i<arr.length;i++){
            System.out.println(" enter the "+ (i+1) +" value :");
            arr[i]=sc.nextInt();
            sum+=(arr[i]);
        }
        System.out.println(arr.length);
        float mean=sum/arr.length;
        System.out.println("Sum : "+sum);
        System.out.println("Mean : "+mean);
    }
}
