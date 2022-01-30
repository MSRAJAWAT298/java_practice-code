import java.util.Scanner;
class Transpose
{
	public static void main(String[] arg)
	{

	int i=0, j=0,k;
	System.out.println("Enter total rows and columns: ");
	Scanner s = new Scanner(System.in);
	int row = s.nextInt();
	int col = s.nextInt();
	int x[][] = new int[row][col];
	System.out.println("Enter matrix element:-");
 	for(i = 0; i <x.length; i++)
  	{
   	    for(j = 0; j <x[0].length; j++)
     	    {
        		x[i][j] = s.nextInt();
        	   k = x[i][j];
            }
	}
	System.out.println("Enter elements are:- ");
	 	for(i = 0; i <x.length; i++)
	  	{
	   	    for(j = 0; j <x[0].length; j++)
	     	    {

	        	 System.out.print(x[i][j] + " ");
            }
            System.out.println();
		}
		 	System.out.println(" Transpose matrix is ");
		  	for(i = 0; i < col; i++)
		    	{
		      	    for(j = 0; j < row; j++)
		            {
		                System.out.print(x[j][i]+" ");
		            }
		            System.out.println(" ");
        }

}
}