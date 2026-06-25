package org.example.WhileLoop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();
        String st="";
        while(s!=0){
            int d=s%10;
            String ss=String.valueOf(d);
            st=st+ss;
            s=s/10;
        }
        System.out.println(Integer.parseInt(st));

    }
}
