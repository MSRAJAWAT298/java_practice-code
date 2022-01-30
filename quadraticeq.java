import java.util.Scanner;
class quadraticeq
{
	public static void main(String[] arg)
	{
		int a,b,c;
		double root1,root2,d;
		System.out.print("Enter the value of a\nb\nc");
		Scanner KB =  new Scanner(System.in);
		a =KB.nextInt();
		b =KB.nextInt();
		c =KB.nextInt();

		System.out.print("Quadratic equation="+a+"x^2+ "+b+"x +"+c);
		d = b*b-4a*c;
		if(d>0)
		{
			System.out.println("Roots are real and unequal");

	}
}
