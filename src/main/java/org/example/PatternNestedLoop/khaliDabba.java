package org.example.PatternNestedLoop;

import java.util.Scanner;

public class khaliDabba {
    public static void main(String[] args) {
        System.out.println("enter the no of n ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i==n||j==n || i==1 || j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }


            }
            System.out.println();

        }
    }
}
