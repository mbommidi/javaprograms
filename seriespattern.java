import java.util.Scanner;
class seriespattern
  {
   public static void main(String args[])
   {
  int i,j,row;
      Scanner n=new Scanner(System.in);
      System.out.println("enter number of rows");
       i=n.nextInt();
      for(row=1;row<=i;row++)
        {
          for(j=1;j<=row;j++)
            {
               System.out.print(row);
            }
            System.out.println();
        }
   }
      
  }
 