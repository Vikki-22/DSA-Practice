package org.example.AdvanceConditionalQuestion;

import java.util.Scanner;

public class Q2CalculateElectricityBillPerUnit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the unit for calculate the electricity bill.....");
        int unit=sc.nextInt();

        if(unit>0 && unit<=100){
            System.out.println(unit * 4.2);
        } else if (unit>100 && unit<=200) {
            System.out.println((100 *4.2)+((unit-100)*6) );
        } else if (unit>200 && unit <=400) {
            System.out.println((100 *4.2)+(100*6)+((unit-200) * 8 ));
        } else if (unit >400) {
            System.out.println((100 *4.2)+(100*6)+(100* 8 )+((unit-400)  * 13));
        }
        else {
            System.out.println("enter the valid unit positive number...");
        }

    }
}
