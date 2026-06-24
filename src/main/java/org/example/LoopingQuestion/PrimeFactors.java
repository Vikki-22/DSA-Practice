package org.example.LoopingQuestion;

import java.util.Scanner;

public class PrimeFactors {
    public static  String primefact(int a){
         String num="";
        for(int i=1;i<=a;i++){

                   int count=0;
                   for(int j=1; j<=i;j++) {
                       if (i % j == 0) {
                           count++;
                       }
                   }
                   if (count==2 && a%i==00){
                       num = num +" "+i;
                   }


        }
        System.out.println(num);
        return  num;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter the number..");
        int b= sc.nextInt();
        PrimeFactors.primefact(b);
    }
}
