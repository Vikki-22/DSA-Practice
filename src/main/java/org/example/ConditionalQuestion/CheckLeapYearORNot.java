package org.example.ConditionalQuestion;

import java.util.Scanner;

public class CheckLeapYearORNot {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the year for check the year is leap year or not......");
        int year=sc.nextInt();
        System.out.println();
        if (year%400==0 || (year%4==0 && year%100!=0  )){
            System.out.println("this is leap year");
        }
        else {
            System.out.println("not a Leap year");
        }
    }
}