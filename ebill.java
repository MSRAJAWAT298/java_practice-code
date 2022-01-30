import java.util.Scanner;
class ebill
{
	public static void main(String[] arg)
	{
		System.out.println("Enter the unit");
		Scanner KB = new Scanner(System.in);
		double unit = KB.nextDouble();

		if(unit<=50)
		{

			double p = 0.50*unit;

			System.out.println("Total bill = " +p);
		}
		else if(unit<=100){

		double p = unit*1.20;
		System.out.println("Total bill="+p);}

		else if(unit>250){

				double p = unit*1.50;
			    double c = p * (20/100);
			     double a =  p+c;
			System.out.println("Unit charge="+p);
			System.out.println("Service Charge 20%="+c);
			System.out.println("Total bill="+a);

			}

	}
}