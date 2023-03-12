package Array;

public class enhancedarray{
    public static void main(String[] args) {
        int num[][]={
            {12,34,5,6,897,33,11,5674},
            {12345,0,34},
            {69,42}
        };

        for(int a[]:num){
            for(int b:a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }




}