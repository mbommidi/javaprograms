// Write a program to initialize your marks for 3 subjects and print the highest marks
import java.util.Scanner;
class Exercise3 {
  public static void main (String arg[]){
Scanner sc =new Scanner(System.in);
System.out.println("enter first subject marks");
int x= sc.nextInt();
 System.out.println("enter second subject marks");
int y= sc.nextInt();
System.out.println("enter third subject marks");
int z= sc.nextInt();
  if  (x > y && x > z)
  {
System.out.println("x is higher");
  }
 else if (y > x && y > z)
 {
System.out.println("y is higher");
  }
 else {
   System.out.println("z is higher");
 }
  }
  }