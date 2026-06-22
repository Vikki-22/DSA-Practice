package org.example.ConditionalQuestion;

import java.util.Scanner;

public class CheckEligibleForVote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the name .....");
        String name=sc.nextLine();
        System.out.println("Enter the age .....");
        int age =sc.nextInt();
        if(age >= 150){
            System.out.println("you enter the wrong age of " +name);
        } else if (age>=18) {
            System.out.println(name+ " is eligible for vote.....");
        }
        else {
            System.out.println(name + "  is not eligible for vote.....");
            System.out.println(name +" eligible for vote  in " + (18-age) +" year");
        }
    }
}
