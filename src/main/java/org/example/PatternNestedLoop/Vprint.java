package org.example.PatternNestedLoop;

import java.util.Scanner;

public class Vprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n..");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int k=i-1;k>=1;k--){
                System.out.print(" ");
            }

                System.out.print("*");

            for (int k=n-i;k>=1;k--){
                System.out.print("  ");
            }
           if(i!=n) {
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
