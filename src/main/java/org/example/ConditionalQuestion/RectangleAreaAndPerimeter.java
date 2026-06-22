package org.example.ConditionalQuestion;

import java.util.Scanner;

public class RectangleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the value of length....");
        int l=sc.nextInt();
        System.out.println(" enter the value of width....");
        int w=sc.nextInt();
        int area= l*w;
        int perimeter =(2*(l+w));
        System.out.println("Area of Rectangle......"+area);
        System.out.println("Perimeter of Rectangle......"+perimeter);


    }
}
