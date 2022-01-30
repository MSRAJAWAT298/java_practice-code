import java.util.Scanner;
class fdigitno
{
	public static void main(String[] arg)
	{int digit,i=0,num=0;

		System.out.print("Enter the digit");
		Scanner KB = new Scanner(System.in);
		digit = KB.nextInt();
		System.out.println("Digit = "+digit);
		num=digit%10;
		while(digit>=10)//digit=1>10
	{
		digit=digit/10;

	}
		System.out.println("1st digit = "+digit);
		System.out.println("last digit = "+num);
	}
}