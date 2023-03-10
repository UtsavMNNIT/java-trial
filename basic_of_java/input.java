package basic_of_java;
import java.util.Scanner;

public class input {
    public static void main(String[]args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age");
        int age =scan.nextInt();
        System.out.println("The age is " + age );  
        Scanner pan=new Scanner(System.in);
        System.out.println("What is your name");
        String name =pan.next();
        System.out.println("My name is " + name ); 
    }
}
