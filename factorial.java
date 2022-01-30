
import java.util.Scanner;

public class factorial
{



	public static void main(String[] args)
{

	int ch;
	do{
	Scanner KB=new Scanner(System.in);
	System.out.print("Enter the number");

	int n=KB.nextInt();
	long f=1;
	while(n>0)
	{
	  f=f*n;
	  n--;
	 }

	 System.out.println("Factorial:"+f);
	 System.out.print("Continue 1-yes 2-No");
	 ch=KB.nextInt();
	 }while(ch==1);
	 }
}