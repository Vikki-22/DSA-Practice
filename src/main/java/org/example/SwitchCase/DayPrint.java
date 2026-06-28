package org.example.SwitchCase;

import java.util.Scanner;

public class DayPrint {

        public static String getDays(int n){
            String s="invalid choice";
            switch (n){
                case 1:
                    s="Monday";
                    break;

                case 2:
                    s="Tuesday";
                    break;

                case 3:
                    s="Wednesday";
                    break;

                case 4:
                    s="Thursday";
                    break;

                case 5:
                    s="Friday";
                    break;

                case 6:
                    s="Saturday";
                    break;

                case 7:
                    s="Sunday";
                    break;

                default:

            }
           return  s;
        }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" enter the no");
        int n= scanner.nextInt();
        String ss=getDays(n);
        System.out.println(ss);
    }
}
