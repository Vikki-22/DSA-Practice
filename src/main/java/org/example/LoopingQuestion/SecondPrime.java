package org.example.LoopingQuestion;

import java.util.Scanner;
//hard level question................
public class SecondPrime {

    public static String primefact(int a) {
        String st="";
        if (a<0){
            st="invalid number";
        } else if (a==0||a==1) {
            st="no prime factor..";
        }
        else {
            for (int i = 2; i <= a; i++) {
                for (; a % i == 0; a = a / i) {
                    st = st + i + " ";
                }
            }
        }
        return st;

    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" enter the value...");
        int b= scanner.nextInt();
        String result= primefact(b);
        System.out.println(result);
    }
}
