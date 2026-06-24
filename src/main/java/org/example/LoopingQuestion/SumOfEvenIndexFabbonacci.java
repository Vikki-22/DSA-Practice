package org.example.LoopingQuestion;

import java.util.Scanner;

public class SumOfEvenIndexFabbonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n tym print sum...");
        int n=sc.nextInt();
        int sum=0;
        int limit=n*2;
        int a=0;
        int b=1;

         for (int i=0;i<=limit;i++){
             if(i%2==0 && i!=0){
                 sum =sum+a;
             }
             int  c= a+b;
             a=b;
             b=c;
         }
        System.out.println(sum);
    }
}
