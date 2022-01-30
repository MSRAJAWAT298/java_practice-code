
import java.util.Scanner;
class Atable
{
	public static void main(String[] arg)
	{
		int t=1,m=1;
		System.out.print("Enter the number");
		Scanner KB =new Scanner(System.in);
		int n = KB.nextInt();
		//create the arrray//
		int a[]=new int[n];
		for(int i=0; i<a.length; i++)//this loop is use for get the array element//
		{
               a[i]=KB.nextInt();
		}
		for(int j=1; j<=10; j++)
		{
		for(int i=0; i<a.length; i++)
							{
								t=a[i]*j;
					//			System.out.print("\t");
								System.out.print(a[i]+"*"+j+"="+t);
											System.out.print("\t ");
		}
			System.out.println();
}
	}
}