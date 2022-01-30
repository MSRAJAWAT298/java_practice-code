import java.util.Scanner;
class Asumofn
{
	public static void main(String[] arg)
	{
		int t=1;
		    Scanner KB=new Scanner(System.in);
		    System.out.print("How many Integers U want to input");
	    	int n=KB.nextInt();
	    	int x[] = new int[n];
	    	for(int i=0; i<x.length; i++)
	    	{
				System.out.print("Enter x["+i+":]");
				x[i]=KB.nextInt();

		for(int j=1; j<=10; i++)
		{
			t=t*x[i];
			System.out.println("Sum of all the numbers are = "+t);}
		}
}
}