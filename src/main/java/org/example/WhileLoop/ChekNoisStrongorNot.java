package org.example.WhileLoop;

import java.util.Scanner;

public class ChekNoisStrongorNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of n for check no is strong or not...");
        int num=sc.nextInt();
        int n=num;
        int sum=0;
        if (n<=0){
            System.out.println("enter the positive value for check the no is strong or not...");
        }
        else {
            while (n != 0) {

                     int d =n%10;
                     int s=1;
                     for(int i=1;i<=d;i++){
                         s*=i;
                     }
                     n=n/10;
                     sum+=s;
            }
            if(sum==num){
                System.out.println("number is strong...");
            }
            else {
                System.out.println("no is not Strong...");
            }
        }
    }
}
