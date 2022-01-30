import java.util.Scanner;
class nrevnatural
{
	public static void main(String[] arg)
	{
		int n;
		System.out.print("Enter the number");
		Scanner KB = new Scanner(System.in);
		n=KB.nextInt();
		while(n>=1)
		{
			System.out.println(n);
			n--;
		}
	}
}