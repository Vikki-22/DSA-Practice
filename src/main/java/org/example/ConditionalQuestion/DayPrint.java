package org.example.ConditionalQuestion;

import java.util.Scanner;

public class DayPrint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the no for print the day.....");
        int no= sc.nextInt();
        if(no<1 || no >7){
            System.out.println("invalid choice.....");
        }
        else {
            if (no==1){
                System.out.println("Sunday");
            } else if (no==2) {
                System.out.println("Monday");
            }
            else if (no==3) {
                System.out.println("Tuesday");
            }else if (no==4) {
                System.out.println("Wednesday");
            }else if (no==5) {
                System.out.println("Thursday");
            }else if (no==6) {
                System.out.println("Friday");
            }else   {
                System.out.println("Saturday");
            }



        }
    }
}
