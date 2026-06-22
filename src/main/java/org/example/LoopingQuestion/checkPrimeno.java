package org.example.LoopingQuestion;

import java.util.Scanner;

public class checkPrimeno {
    public static void main(String[] args) {
        System.out.println("Enter the Number.... ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime No...");
        }
        else {
            System.out.println("Not prime");
        }

    }
}
