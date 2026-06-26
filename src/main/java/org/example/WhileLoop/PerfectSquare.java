package org.example.WhileLoop;

import java.util.Scanner;

public class PerfectSquare {
    public  static String isperfectsquare(int num){
        int a=1;
        int b=num;
        String s=" not perfect square";
        while(a<=b){  //a<=b
            int mid = (a +b)/2;
            int n=mid*mid;
            if(n==num){
                s="perfect square";
                System.out.println(mid);
                break;
            }
            else if(n>num){
                b=mid-1;
            }
            else{
                a=mid+1;
            }
        }
                return s;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n");
        int ab=sc.nextInt();
      String s=  isperfectsquare(ab);
        System.out.println(s);
    }
}
