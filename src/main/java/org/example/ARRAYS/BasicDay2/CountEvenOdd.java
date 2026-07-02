package org.example.ARRAYS.BasicDay2;

public class CountEvenOdd {
    public static void main(String[] args) {
        int ar1[] = {1, 2, 3, 4, 5, 6, 7};
        int evencount=0;
        int oddcount=0;

        for (int value:ar1){
            if(value%2==0){
                evencount++;
            }
            else {
                oddcount++;
            }
        }
        System.out.println("even count : "+evencount);
        System.out.println("odd count : "+oddcount);
    }
}
