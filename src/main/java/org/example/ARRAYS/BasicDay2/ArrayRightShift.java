package org.example.ARRAYS.BasicDay2;

public class ArrayRightShift {
    public static void main(String[] args) {
        int ar[]={10,20,54,42,21,65,24,12,36,985,75,38,97,61,84,83,81,13,18,50,100,154,165};

        System.out.print("Before : ");
        for (int val : ar){
            System.out.print(val +" ");
        }
        int last=ar[ar.length-1];
        for (int i=ar.length-1;i>0;i--){

            ar[i] = ar[i - 1];
        }
        System.out.println();
        System.out.print(" After : ");
        ar[0]=last;
        for (int val : ar){
            System.out.print(val +" ");
        }
    }
}
