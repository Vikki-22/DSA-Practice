package org.example.LoopingQuestion;

import java.util.Scanner;

public class PowerCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a=sc.nextInt();
        System.out.println("Enter the second value");
        int b=sc.nextInt();
        int power=a;
        for (int i=1;i<b;i++){
            power=power*a;
        }
        System.out.println(power);

    }
}
