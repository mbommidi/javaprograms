/*Write a program to find number of days in a month
Test Data: 
month number=2
year=2020
Expected Output: February 2020 has 29 days
*/
import java.util.Scanner;
class Exercise2 {

	public static void main(String args[]) {
int month, year;
  Scanner sc= new Scanner(System.in);
  System.out.println("please Enter month number");
  month = sc.nextInt();
    System.out.println("please Enter year");
  year = sc.nextInt();
  if (month==1||month==3||month==5||month==7||month==8||month==10||month==12)
  {
    System.out.println("\n 31 days in this month");
  }
    else if (month==4||month==6||month==9||month==11)
    {
    System.out.println("\30 days in this month");
    }
    else if (month==2)
    {
    System.out.println("February has 29 days");
    }
    else
    {
    System.out.println("please Enter valid number between 1 to 12");
  }
  }

	}

