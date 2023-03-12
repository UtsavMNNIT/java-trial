package complex_loops;

import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

public class diagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the vertex");
        int vertex = scan.nextInt();
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                if (i == j || i+j==vertex-1) {
                    System.out.print("* ");
                } 
                
                else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

    }
}
