package org.example.ARRAYS.BasicDay2;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int ar[] = {
                10, 12, 13, 18, 20, 21, 24, 36, 38, 42,
                50, 54, 61, 65, 75, 81, 83, 84, 97, 100,
                154, 165, 985
        };
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter value for search  :");
        int n= sc.nextInt();
        boolean flag=false;
        int index=0;

        int st=0;
        int end=ar.length-1;
        while (st<=end){
            int mid=(st+end)/2;
            if (n==ar[mid]){
                index=mid;
                System.out.println("found the no " +n + " is in "+index +" index.");
                flag=true;
                break;
            } else if (n>ar[mid]) {
                st=mid+1;
            }else {
                end=mid-1;
            }
        }
        if (!flag)
            System.out.println("Not Found");
    }
}
