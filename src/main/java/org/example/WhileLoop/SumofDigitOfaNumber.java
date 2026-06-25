package org.example.WhileLoop;

import java.util.Scanner;

public class SumofDigitOfaNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no of sum");
        int n= sc.nextInt();
        int sum=0;
        while (n!=0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println("sum :"+sum);
    }
}
