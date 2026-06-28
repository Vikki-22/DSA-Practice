package org.example.SwitchCase;

import jdk.jshell.execution.Util;

import java.util.Scanner;

public class AreaCalculate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("------Calculate area:------");
        System.out.println("Enter 1 for circle");
        System.out.println("Enter 2 for rectangle");
        System.out.println("Enter 3 for triangle");
        int n= sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Circle");
                System.out.println("enter the radius value of a circle...");
                int r= sc.nextInt();
                System.out.println(Math.PI*r*r);
                break;

            case 2:
                System.out.println("Rectangle");
                System.out.println("enter the length of  rectangle...");
                int l= sc.nextInt();
                System.out.println("enter the breadth of  rectangle...");
                int b=sc.nextInt();
                System.out.println(l*b);
                break;

            case 3:
                System.out.println("Triangle");
                System.out.println("enter the base of  triangle...");
                int base= sc.nextInt();
                System.out.println("enter the height of  triangle...");
                int h=sc.nextInt();
                System.out.println((base*h)/2);
                break;

            default :
                System.out.println("invalid choice...");
        }
    }
}
