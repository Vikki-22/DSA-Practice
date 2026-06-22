package org.example.LoopingQuestion;

public class Factorialprint {
    public static  void factorial(int n){
        long fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        System.out.println(fact);

    }

    public static void main(String[] args) {
        Factorialprint.factorial(5);
    }
}
