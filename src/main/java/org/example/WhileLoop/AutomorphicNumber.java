package org.example.WhileLoop;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the no  ");
        int n=sc.nextInt();  // 25
        int num=n*n; //25*25 =625
        System.out.println(num);
        String s="";
        boolean flag = false;  //false
        while(num > 0) {             //625 >0 , 62<0
            int d = num % 10;  // 5   , 2
            s = d + s; //5    25
            int dd = Integer.parseInt(s); // false
            if(dd == n) {
                flag = true;     // exit
                break;
            }

            num = num / 10;  //62
        }

        if(flag)  //true
            System.out.println("number is automorphic..");
        else
            System.out.println("not automorphic");

    }
}
