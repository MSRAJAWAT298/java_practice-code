import java.util.Scanner;
class iintcheck
{
 	public static void main(String[] arg)
 	{
		System.out.print("Enter the number");
		Scanner KB = new Scanner(System.in);
		int n = KB.nextInt();

		if(n>0)
		System.out.println("Positive number");

		else if(n<0)
		System.out.println("Negative number");
	    else if(n==0)
		System.out.println("ZERO");
	}



}
