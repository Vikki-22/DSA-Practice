package org.example.ARRAYS.BasicDay1;

import java.util.Scanner;

public class FindSecondHighest {
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
        int greates=Math.max(arr[0],arr[1]);
        int secgreates=Math.min(arr[0],arr[1]);
        for(int k=2;k<arr.length;k++){

            if(arr[k]>greates){
                secgreates=greates;
                greates=arr[k];
            } else if (arr[k]>secgreates && arr[k]!=greates) {
                secgreates=arr[k];
            }

        }
        System.out.println();
        System.out.println("second greatest :"+secgreates);
    }
}
