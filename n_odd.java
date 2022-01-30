import java.util.Scanner;
class n_odd
{
	public static void main(String[] arg)
	{
		int n,i=0;
		System.out.print("Enter the number");
		Scanner KB = new Scanner(System.in);
		n=KB.nextInt();
		while(i<=n)
		{
			i=i+1;
			System.out.println(i);
			i++;
		}
	}
}