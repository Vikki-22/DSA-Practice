package org.example.Do_While;

import java.util.Scanner;

public class GameNofind {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        System.out.println("--------Hello this is a no guess game--------");
        System.out.println();
        int no=(int)(Math.random()*10);
        int attempt =0;

        do
        {
            attempt++;
            System.out.println("PLS Enter your No....");
            int  UserGuessNO=sc.nextInt();
            if(UserGuessNO==no){
                System.out.println(" you won the game in "+attempt +" attempt.");
                System.out.println("your no and guess no is "+no);
                break;
            }
            else if(UserGuessNO>no){
                System.out.println(" To High..");
            }else{
                System.out.println("To Low..");
            }

        }
        while (no>=0);
    }
}
