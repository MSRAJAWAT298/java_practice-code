import java.util.Scanner;
class EXSwitch
{
	public static void main(String[] arg)
	{
		Scanner KB = new Scanner(System.in);
		System.out.print("Enter car name");
		String c=KB.nextLine();
		switch(c)
		{
			case "Alto":
			System.out.println("Price 300000");
			break;

						case "Ciaz":
						System.out.println("Price 130000");
			break;

						case "Tesal":
						System.out.println("Price 5000000");
			break;
			default:
			System.out.println("Wrong");
		}
	}
}