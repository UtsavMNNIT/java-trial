package Array;

public class D2array {
    public static void main(String[] args) {
        int arr[][]= new int[3][2];
        arr[0][0]=4;
        arr[0][1]=56;
        
        arr[1][0]=45;
        arr[1][1]=123;
        
        arr[2][0]=96;
        arr[2][1]=55;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
