package org.example.WhileLoop;

import java.util.Scanner;

public class SeprateDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
//         String sum="";

         while (n>0){
             int dig=n%10;
//             sum=sum+dig;
             System.out.print(dig);
             n=n/10;

         }
//        System.out.println(sum);
    }
}
