import java.util.Scanner;

class bubbleSort
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of array     ");
		int size=s.nextInt();
		int array[]=new int[size];
		for(int i=0;i<array.length;i++)
		{
			System.out.print("Enter ["+i+"] : ");
			array[i]=s.nextInt();
		}
		int pass,current=size-1;
		for(pass=0;pass<array.length;pass++)
		{
			for(int i=0;i<current;i++)
			{
				if(array[i]>array[i+1])
				{
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}current--;
			}
		}
		System.out.println("ARRAY AFTER SHORTING...");
		for(int i=0;i<array.length;i++)
		{
			System.out.println("\nEnter ["+i+"] : "+array[i]);
		}
	}
}