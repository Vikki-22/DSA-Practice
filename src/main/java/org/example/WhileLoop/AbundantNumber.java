package org.example.WhileLoop;

import java.util.Scanner;

public class AbundantNumber {
    public static void checkAbundantNo(int n){
        int sum=0;
        int a=1;
        while (a<n){
            if(n%a==0)
            {
                sum+=a;
            }
            a++;
        }
        if(sum>n){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no..");
        int a=sc.nextInt();
        checkAbundantNo(a);
    }
}
