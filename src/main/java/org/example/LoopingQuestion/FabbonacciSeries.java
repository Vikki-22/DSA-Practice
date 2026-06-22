package org.example.LoopingQuestion;

import java.util.Scanner;

public class FabbonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the limit ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        for (int i=1;i<=n;i++){
            System.out.print(a +" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
