package org.example.ARRAYS.BasicDay2;

import java.util.Scanner;

public class KShift {
    public static void main(String[] args) {
        int ar[]={10,20,54,42,21,65,24,12,36,985,75,38,97,61,84,83,81,13,18,50,100,154,165};

        System.out.print("Before : ");
        for (int val : ar){
            System.out.print(val +" ");
        }
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        for(int j=1;j<=k;j++) {
            int first = ar[0];
            for (int i = 0; i < ar.length - 1; i++) {
                ar[i] = ar[i + 1];
            }

            ar[ar.length - 1] = first;
        }
        System.out.println();
        System.out.print(" After : ");

        for (int val : ar) {
            System.out.print(val + " ");
        }
    }
}
