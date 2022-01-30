import java.util.Scanner;

class linearSearch
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of array     ");
		int size=s.nextInt();
		int array[]=new int[size];
		for(int i=0;i<array.length;i++)
		{
			System.out.print("Enter ["+(i+1)+"] : ");
			array[i]=s.nextInt();
		}
		int ch;
		do{
			int flag=0;
			System.out.print("\nENTER NUMBER TO BE SEARCH...    ");
			int num=s.nextInt();
			for(int i=0;i<array.length;i++)
			{
				if(array[i]==num)
				{
					flag++;
					System.out.print("\nFOUND ON "+(i+1)+" PLACE\n");

				}

			}
			if(flag==0)
			{
				System.out.print("NOT FOUND\n");
			}
			System.out.print("WANT TO SEARCH ONCE MORE...\n1.YES\n2.NO                ");
			ch=s.nextInt();
		}while(ch!=2);
	}
}