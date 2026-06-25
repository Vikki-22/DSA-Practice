package org.example.WhileLoop;

import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void checkpalindrome(int n){
         String st="";
         int num=n;
         if(n<0){
             System.out.println("not palindrome");
         }
         else if(n==0){
             System.out.println("palindrome");
         }else{
             while (n != 0) {
                 int d = n % 10;
                 String ss = String.valueOf(d);
                 st += ss;
                 n = n / 10;
             }
             int dd = Integer.parseInt(st);
             if (dd == num) {
                 System.out.println("Number is palindrome number");
             } else {
                 System.out.println("Number is not palindrome number");
             }
         }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println(" enter the no ");
        int num=s.nextInt();
        checkpalindrome(num);
    }
}
