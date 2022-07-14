// Complete and execute java Program for Narrow/Explicit Type-casting

class Sample1 {
	public static void main(String args[])
	{
		// Initialize a variable to store your marks of Computer Science subject- out of 5
		int cs=45;
		// Calculate the percentage of marks and store it in a float variable
		float percentage=(float) cs/50*100;
    System.out.println("prcentage of cs marks="+percentage);
		// Cast the percentage to int(whole number, decimal points removed)
		int newpercentage=(int) percentage;
		// Print the casted percentage
		System.out.println("Percentage of marks in CS = "+newpercentage );
	}

}
