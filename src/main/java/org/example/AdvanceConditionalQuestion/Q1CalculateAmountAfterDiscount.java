package org.example.AdvanceConditionalQuestion;

import java.util.Scanner;

public class Q1CalculateAmountAfterDiscount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Amount.....");
        int amount=sc.nextInt();

        //check condition if amount is greater than 0 otherwise print enter the positive ammmount

        if(amount<0){
            System.out.println("pls enter the positive and valid amount...");
        } else if ( amount> 0 && amount<=5000) {
            System.out.println( amount );
        } else if ( amount >5000 && amount<=7000) {
            System.out.println( amount - ((amount *5)/100));
        }else if ( amount >7000 && amount<=9000) {
            System.out.println( amount - ((amount *10)/100));
        }
        else {
            System.out.println( amount - ((amount *20)/100));
        }

    }
}
