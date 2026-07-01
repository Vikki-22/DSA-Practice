package org.example.ARRAYS.BasicDay1;

import java.util.Scanner;

public class CheckArraySortOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of Arrays....");
        int arr[]= new int[sc.nextInt()];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the "+(i+1) +" value");
            arr[i]=sc.nextInt();
        }
        System.out.print("[ ");
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+ " ");
        }
        System.out.print("]");

        boolean isSort=true;
        for (int i=0; i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                isSort=false;
                break;
            }
        }

        if (isSort){
            System.out.println("  True");
        }
        else{
            System.out.println("  False");
        }

    }
}
