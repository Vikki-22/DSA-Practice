package org.example.ConditionalQuestion;

import java.util.Scanner;

public class FindGretestNoAmongThree {

    public static int findGretest(int a ,int b , int c){

        if(a==b && a==c){
            System.out.println("All no are Equals.................");
        }
        if (a==b && a>c){
            System.out.println(" a and b is equal  ");
        } else if (b==c && b>=a) {
            System.out.println(" b and a is equal ");
        }
        else if (a>b && a>c) {
            System.out.println(" a is big ");
        }
        else if (b>a && b>c) {
            System.out.println(" b is big ");
        }
        else {
            System.out.println("c is big");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first no");
        int x=sc.nextInt();
        System.out.println("enter the second no");
        int y=sc.nextInt();
        System.out.println("enter the third no");
        int z=sc.nextInt();
        FindGretestNoAmongThree.findGretest(x,y,z);
    }
}
