/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/
import java.util.Scanner;
public class Pattern {
     
//Add main method here
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
  System.out.println("Enter the number of rows to print the pattern");
  
//Declare variable n and initialize value as 5
int  row=sc.nextInt();
  System.out.println("** printing the pattern...**");
//Check whether the i and j are equal or not using for loop
for (int i=1;i<=5;i++){
  for (int j=1;j<=i;j++){
    System.out.print(j%2 +"");
  }
  System.out.println();
//If i and j are equal check (i+j)%2==0 or not if zero then print one else print zero

}
}
}