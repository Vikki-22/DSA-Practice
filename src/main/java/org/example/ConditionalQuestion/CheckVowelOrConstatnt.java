package org.example.ConditionalQuestion;

import java.util.Scanner;

public class CheckVowelOrConstatnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of input for check the alphabet is vowel or constant");
        char input=sc.next().charAt(0);
        if ((input<='z' && input >='a')|(input<='Z' && input >='A'))
        {
            if ((input == 'a') | (input == 'A') | (input == 'e') | (input == 'E') | (input == 'i')
                    | (input == 'I') | (input == 'o') | (input == 'O') | (input == 'u') | (input == 'U')) {
                System.out.println("the character is vowel");
            } else {
                System.out.println("the character is constant");
            }
        }
        else {
            System.out.println("invalid input");
        }
    }
}
