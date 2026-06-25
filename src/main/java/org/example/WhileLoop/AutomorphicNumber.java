package org.example.WhileLoop;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the no  ");
        int n=sc.nextInt();
        int num=n*n;
        System.out.println(num);
        String s="";
        boolean flag = false;
        while(num > 0) {
            int d = num % 10;
            s = d + s;
            int dd = Integer.parseInt(s);
            if(dd == n) {
                flag = true;
                break;
            }

            num = num / 10;
        }

        if(flag)
            System.out.println("number is automorphic..");
        else
            System.out.println("not automorphic");

    }
}
