// Write a program to print all odd numbers between 1 to 100 using 'continue'

class Exercise1 {

	public static void main(String args[]) {
    
     
    for(int i=1;i<100;i++)
      {
      if(i%2==0)
        continue;
    System.out.println(i);
      }
	}

}