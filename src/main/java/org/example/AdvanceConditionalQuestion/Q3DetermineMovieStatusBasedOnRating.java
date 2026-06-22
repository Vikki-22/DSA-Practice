package org.example.AdvanceConditionalQuestion;

import java.util.Scanner;

public class Q3DetermineMovieStatusBasedOnRating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rating.....");
        float rating=sc.nextFloat();
        if(rating>=0.0 && rating<=2.0){
            System.out.println("Flop");
        } else if (rating>2.0 && rating<=3.4) {
            System.out.println("SemiHit");
        }else if (rating>3.4 && rating<=4.5) {
            System.out.println("Hit");
        }else if (rating>4.4 && rating<=5.0) {
            System.out.println("SuperHit");
        }
        else {
            System.out.println("You take wrong input rating.....");
        }



    }
}
