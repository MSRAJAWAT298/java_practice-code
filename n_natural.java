import java.util.Scanner;
class n_natural
{
	public static void main(String[] arg)
	{
		int n,i=0;
		System.out.print("Enter the number");
		Scanner KB = new Scanner(System.in);
		n=KB.nextInt();
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}