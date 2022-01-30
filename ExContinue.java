import java.util.Scanner;
class ExContinue
{
	public static void main(String[] arg)
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			if(i<=5)//its field when i=6 i.e; conditon false
			{
				i=i+1;
				continue;
			}
			i=i+2;
		}
	}
}