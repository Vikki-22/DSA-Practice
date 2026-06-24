package org.example.LoopingQuestion;

import java.util.Scanner;
//hard question...............

public class TotalDivisior {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number...");
        int n= sc.nextInt();
        System.out.println("enter the sec number...");
        int x=sc.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            int divisiorcount=0;
            for (int j=1;j<=i;j++) {
                if (i%j == 0) {
                    divisiorcount++;
                }
            }
            if(divisiorcount==x){
                count++;

            }
        }
        System.out.println(count);
    }
}
