package org.example.ARRAYS.BasicDay2;

public class MoveZeroEndTwoPointerApproch {
    public static void main(String[] args) {
        int ar[] = {0,20,0,42,21,0,24,12,0,0,75,38};
        int j=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]!=0){
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
                j++;
            }
        }
        for (int val : ar){
            System.out.print(val +" ");
        }
    }
}
