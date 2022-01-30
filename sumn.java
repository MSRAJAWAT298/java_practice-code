import java.util.Scanner;
class sumn
{
	public static void main(String[] arg)
	{
		int n,a=0,i=0;
		System.out.print("Enter the number");
		Scanner KB = new Scanner(System.in);
		n=KB.nextInt();
		while(i<=n)
		{
			a=a+i;
			System.out.println(i);
			i++;
		}

		System.out.println("Total sum" +a);
	}
}