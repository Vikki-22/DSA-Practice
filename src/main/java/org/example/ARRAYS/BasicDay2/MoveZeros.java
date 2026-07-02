public class MoveZeros {

    public static void main(String[] args) {
        int ar[] = {0,20,0,42,21,0,24,12,0,0,75,38};
        int j = ar.length - 1;
        for(int i = 0; i < ar.length; i++){
            if(i >= j)
                break;
            if(ar[i] == 0){
                while(j > i && ar[j] == 0){
                    j--;
                }
                if(j > i){
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;

                    j--;
                }
            }
        }

        for(int x : ar){
            System.out.print(x + " ");
        }

    }
}