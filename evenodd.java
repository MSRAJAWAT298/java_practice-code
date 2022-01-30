import java.util.Scanner;
class evenodd
{
	public static void main(String[] arg)
	{
		System.out.println("Enter the number");
		Scanner KB=new Scanner(System.in);
	    int n=KB.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}