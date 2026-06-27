package org.example.WhileLoop;

import java.util.Scanner;

public class ISBNNo10 {
    public static void main(String[] args) {

        //check the given 10 digit no is valid Isbn Number or not after into sum is properly divide  by 11 so no is ValidIsbn NO

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no of n");
        long num=sc.nextLong();
        long sum=0;
         int i=1;
         int count=0;
        while (num!=0){
            long n=num%10;
            long ab=n*i;
            sum+=ab;
            i++;
            count++;
            num/=10;
        }
        System.out.println(sum);
        if(count==10){
            if(sum%11==0){
                System.out.println("Valid ISBN Number");
            }else {
                System.out.println("Invalid ISBN Number");
            }
        }else{
            System.out.println("pls enter the 10 digit no...");
        }
    }
}
