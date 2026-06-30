package org.example.PatternNestedLoop;

import java.util.Scanner;

public class DamruPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n...");
        int n = sc.nextInt();
        //upper loop
        for (int i = 1; i <= n; i++) {
            //left
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//            right
            for (int k = n - i; k >= 1; k--) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }




            // lower
        for (int i = n-1; i >= 1; i--) {
            //left
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
//            right
            for (int k = n - i; k >= 1; k--) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
