package complex_loops;

import java.util.Scanner;

public class diamond2 {
    public static void main(String[]args) 
    {
        Scanner scan= new Scanner (System.in);
        System.out.println("Enter the vertex");
        int n=scan.nextInt();      
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0 && j==(n-1)/2 || j==0 && i==(n-1)/2 || i+j<=(n-1)/2) || (i==n-1 &&j==(n-1)/2) || (j==0 && i==(n-1)/2) || i-j<=(n-1)/2  ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        } 
    }
}
