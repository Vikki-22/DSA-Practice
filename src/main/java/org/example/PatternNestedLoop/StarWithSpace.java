package org.example.PatternNestedLoop;

import java.util.Scanner;

public class StarWithSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int k=n-i;k>=1;k--){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
