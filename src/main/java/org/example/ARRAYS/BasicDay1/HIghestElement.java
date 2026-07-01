package org.example.ARRAYS.BasicDay1;

import java.util.Scanner;

public class HIghestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array...");
        int arr[]= new int[sc.nextInt()];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the "+(i+1)+" value");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int index=0;
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
            if(arr[j]>max){
                max=arr[j];
                index=j;
            }
        }
        System.out.println();
        System.out.println(max+" found at "+index +" index.");
    }
}
