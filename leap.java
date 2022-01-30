import java.util.Scanner;
class leap
{

	public static void main(String[] arg)
	{
		int c;
//starting loop

        do{
			System.out.print("Enter the year which u want check");
			Scanner KB=new Scanner(System.in);
	    int n=KB.nextInt();
					if(n%4==0 && n%100!=0 || n%400==0)
									System.out.println("\tLeap year");
					else
							System.out.println("\tNot a leap year");
							System.out.println("Do you want to continue.......\nPress:- 1.yes 2.No");
                 		  c=KB.nextInt();
     	}while(c==1);
	}



}