package org.example.AdvanceConditionalQuestion;

import java.util.Scanner;

public class Q4SalaryCheck {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the gender");
        char gender= sc.next().charAt(0);
        System.out.println("enter the year of services");
        int YearOfServices= sc.nextInt();
        System.out.println("enter the qualification");
        char qualification= sc.next().charAt(0);

        if (YearOfServices <0 && YearOfServices >30){
            System.out.println("invalid choice");
        }
        else {
            if ((gender == 'm' || gender=='M') && (YearOfServices >= 10) && (qualification == 'p')) {
                System.out.println("15000");
            }
            else  if ((gender == 'm' || gender=='M' ) && (YearOfServices >= 10) && (qualification == 'u')) {
                System.out.println("10000");
            }
            else  if ((gender == 'm' || gender=='M') && (YearOfServices < 10) && (qualification == 'p')) {
                System.out.println("10000");
            }
            else  if ((gender == 'm' || gender=='M') && (YearOfServices < 10) && (qualification == 'u')) {
                System.out.println("7000");
            }
            else  if ((gender == 'f' || gender=='F' ) && (YearOfServices >= 10) && (qualification == 'p')) {
                System.out.println("12000");
            }
            else  if ((gender == 'f' || gender=='F') && (YearOfServices >= 10) && (qualification == 'u')) {
                System.out.println("9000");
            }
            else  if ((gender == 'f' || gender=='F') && (YearOfServices < 10) && (qualification == 'p')) {
                System.out.println("10000");
            }
            else  if ((gender == 'f' || gender=='F') && (YearOfServices < 10) && (qualification == 'u')) {
                System.out.println("6000");
            }
            else if(YearOfServices<0){
                System.out.println("pls enter the positive no....");
            }
        }
    }
}
