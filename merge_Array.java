import java.util.Scanner;
class merge_Array
{
	public static void main(String[] arg)
	{
		Scanner KB =new Scanner(System.in);
		System.out.print("Enter the limit for array of X ?");
		int n=KB.nextInt();
		int x[]=new int[n];
		for(int i=0; i<x.length; i++)
		{
		//	System.out.print();
			x[i]=KB.nextInt();
		}


				System.out.print("Enter the limit for array of Y?");
				int m=KB.nextInt();
				int y[]=new int[m];
				for(int i=0; i<y.length; i++)
				{
					System.out.print(i);
						y[i]=KB.nextInt();
		}

		int z[]=new int[n+m];
		for(int i=0;i<z.length; i++)
		{
			if(i<x.length)
			{
				z[i]=x[i];
			}
			else {
				z[i]=y[i-x.length];}
				System.out.print(z[i]);
		}
}
}
