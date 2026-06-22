package org.example.LoopingQuestion;

import java.util.Scanner;

public class AddAllfactorNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no for print all factors addition");
        int n= sc.nextInt();
        int SumOfAllFactors=0;
        for(int i =1; i<n;i++){
            if(n%i==0){
                SumOfAllFactors +=i;
            }
        }
        System.out.println(SumOfAllFactors);
    }
}
