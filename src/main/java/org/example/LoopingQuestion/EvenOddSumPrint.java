package org.example.LoopingQuestion;

import java.util.Scanner;

public class EvenOddSumPrint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lower bound value");
        int i=sc.nextInt();
        System.out.println("Enter the upper bound value");

        int n= sc.nextInt();
        int even=0;
        int odd=0;
        for(int a=i;a<=n;a++){
            if (a%2==0){
                even +=a;
            }
            else{
                odd +=a;
            }
        }
        System.out.println("even "+even);
        System.out.println("odd "+odd);
    }
}
