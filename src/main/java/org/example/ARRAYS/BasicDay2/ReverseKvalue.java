package org.example.ARRAYS.BasicDay2;

import java.util.Scanner;

public class ReverseKvalue {
    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(" enter the value of k");
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        for (int val: arr){
            System.out.print(val+" ");
        }

        System.out.println();
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);

        for (int val: arr){
            System.out.print(val+" ");
        }
    }
}
