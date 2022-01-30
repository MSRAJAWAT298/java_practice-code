import java.util.Scanner;
class count_digit
{
	public static void main(String[] arg)
	{ long digit;
	  int count=0;

		System.out.print("Enter the digit");
		Scanner KB = new Scanner(System.in);
		digit = KB.nextInt();
		System.out.println("Digit = "+digit);

	while(digit!=0)
			{
				digit/=10;
				++count;
			}

		System.out.println("Total digit = "+count);
}

}