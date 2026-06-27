package org.example.WhileLoop;

import java.util.Scanner;

public class CheckNoisNeonNo {
    // if no ka square krke umke digit ko apas me add krne me yadi value given n ke barabar aari to vo neon no hai
    public static String no(int n){

        int num=n*n;
        int sum=0;
        String s="No";
        while(num!=0){
            int a=num%10;
            sum+=a;
            num/=10;
        }
        if(sum==n){
            s="Yes";
        }

        return  s;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no..");
        int n= sc.nextInt();
       String s= no(n);
        System.out.println(s);
    }

}
