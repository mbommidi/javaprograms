/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {
  public static void main(String args[]){

//main method


 // Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);



 // Take input from user
  System.out.println("Enter a value: ");
  int a=sc.nextInt();
  System.out.println("Enter b value:");
  int b=sc.nextInt();
  System.out.println( "Difference of two numbers=" +(a-b));
    System.out.println("Enter c value:");
    int c=sc.nextInt();
    System.out.println("Enter d value:");
    int d=sc.nextInt();
System.out.println( "product of two numbers=" +(c*d));
    System.out.println("Enter e value:");
    int e=sc.nextInt();
    System.out.println("Enter f value:");
   int f=sc.nextInt();
    System.out.println("Enter g value:");
    int g=sc.nextInt();
    System.out.println("Enter h value");
    int h=sc.nextInt();
    System.out.println("Enter i value");
    int i=sc.nextInt();
    System.out.println("Divisuion of numbers="+(e/f));
    System.out.println("Increment and Decrement the number="+(g));
    System.out.println("remainder of two numbers="+(h%i));
//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations
  }
}