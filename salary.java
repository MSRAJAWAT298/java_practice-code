import java.util.Scanner;
class salary
{
	public static void main(String[] arg)
	{
		int DA=0,HRA=0;
		System.out.print("Enter the Salary Amount");
		Scanner KB = new Scanner(System.in);
		int s=KB.nextInt();
		if(s>=10000)
		{
			  HRA = s*20/100;
			  DA  = s*80/100;
 		}
			else if(s>=20000)
			{
				  HRA  = s*25/100;
				  DA  = s*90/100;
			}
			else if(s>=30000)
			{
				  HRA = s*30/100;
				  HRA = s*95/100;
			}
			else
			{
				System.out.println("Invalid amount \nAmount most be grater than & equal to 10000");
			}
			if(s>=10000)
			{
			int ns;
			ns =  s+HRA+DA;
			System.out.println("----------PAY SLIP------");
			System.out.println("Basic salary="+s);
			System.out.println("Dearness amount="+DA);
			System.out.println("House rent Allownes="+HRA);
			System.out.println("Net salary="+ns);
		}
	}
}