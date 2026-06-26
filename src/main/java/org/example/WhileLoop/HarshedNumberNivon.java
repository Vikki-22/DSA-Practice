package org.example.WhileLoop;

import java.util.Scanner;

public class HarshedNumberNivon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the no for check the no is nivon no or not....");
        int num=sc.nextInt();
        int n=num;
        int sum=0;
            while (num!=0){
                int a=num%10;
                sum+=a;
                num=num/10;
            }
             if(n%sum==0) {

                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }

    }

