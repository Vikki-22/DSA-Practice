package org.example.ARRAYS.BasicDay2;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int ar[]={10,20,54,42,21,65,24,12,36,985,75,38,97,61,84,83,81,13,18,50,100,154,165};
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter value for search  :");
        int n= sc.nextInt();
        boolean flag=false;
        int index=0;
        for (int value:ar){
            if (value==n){
                System.out.println(" find the value of "+value +" is index no "+index);
                flag=true;
                break;
            }
            index++;
        }
        if (!flag)
            System.out.println("not found...");
    }
}
