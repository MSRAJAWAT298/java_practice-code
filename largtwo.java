import java.util.Scanner;

public class largtwo
{
    public static void main(String args[])
    {
        int a, b, big;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Two Number"  );
        a = scan.nextInt();
        b = scan.nextInt();

        if(a>b)
        {
            big = a;
        }
        else
        {
            big = b;
        }

        System.out.println("Largest ="+big);
    }
}