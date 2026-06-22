package org.example.ConditionalQuestion;

import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the principal of amount....");
        double p=sc.nextDouble();
        System.out.println("enter the annual rate....");
        double r=sc.nextDouble();
        System.out.println("enter the time....");
        double t=sc.nextDouble();
       System.out.println("enter the no of time....");
        double n=sc.nextDouble();
        double A = p * Math.pow((1 + (r / n)), (n * t));
        System.out.println("A ="+ A);
         double CI=A-p;
        System.out.println("CI ="+CI);
    }
}
