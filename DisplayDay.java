
 // JFM1T4_Assignment2:
//  Write a program to display the name of the day, based on the number, using the switch statement.
//  Prompt the user to input a number between 1 and w Scanner(System.in);
import java.util.Scanner;
class DisplayDay{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter number of displaying day:");
    
   int number=sc.nextInt();
    switch (number)
      {
        case 1:
         System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
      }
  }
}
            
    







