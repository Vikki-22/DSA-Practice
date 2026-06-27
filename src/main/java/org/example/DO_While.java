package org.example;

import java.util.Scanner;

public class DO_While {
    public static  void printt(int n) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Hello");
           n = sc.nextInt();
        }
        while (n == 1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printt(n);
    }
}
