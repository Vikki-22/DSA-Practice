package org.example.WhileLoop;
import java.util.Scanner;
public class FindHighestCommonFactorOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first no..");
        long a= sc.nextLong();
        System.out.println("Enter the second no..");
        long b= sc.nextLong();
        long n;
        if(a<0 || b<0){
            System.out.println("enter the positive number");
        }
        else {
            if (a < b) {
                n = a;
            } else {
                n = b;
            }
            while (n > 0){
                if(a%n==0 && b%n==0){
                    System.out.println(n);
                    break;
                }
                n=n-1;
            }
        }
    }
}
