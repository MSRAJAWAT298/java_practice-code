import java.util.Scanner;
class ExArray
{
	public static void main(String[] arg)
	{
		    Scanner KB=new Scanner(System.in);
		    System.out.print("How many Integers U want to input");
	    	int n=KB.nextInt();
	    	int x[] = new int[n];
	    	for(int i=0; i<x.length; i++)
	    	{
				System.out.print("Enter x["+i+":]");
				x[i]=KB.nextInt();

			}
				//for(int i=0;i<x.length;i++)
				System.out.println(x);
				int y[] =x;
					System.out.println(y[2]);
					y[2]=y[2]+100;
					System.out.println(x[2]);
	}


}