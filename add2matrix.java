import java.util.Scanner;
class add2matrix
{//Starting class//
	public static void main(String[] arg)
	{//Starting main//
		int i,j=0;
		Scanner n = new Scanner(System.in);

		System.out.print("Enter the rows");
		int row = n.nextInt();
		System.out.print("Enter the Column");
		int col = n.nextInt();
	    int x[][] = new int[row][col];
	    int y[][] = new int[row][col];
	    int z[][] = new int[row][col];

//=================for loop for x[][]================//
	System.out.print("Enter the elements for matrix 1st");
		for(i=0; i<x.length; i++)
		{
			for( j=0; j<x[0].length; j++)
			{
				x[i][j]=n.nextInt();
     		}
    	}
//==================for loop for print x[][]==================//
  System.out.print("1st matrix is : - \n");
			for(i=0; i<x.length; i++)
			{																			//<-----Starting outter loop//
				for(j=0; j<x[0].length; j++)
				{																		//<----Starting inner loop//
					System.out.print(x[i][j] + " ");
				}																		//<-----ending inner loop//
				System.out.println();
		}	//ending outter loop

//=============Starting for create 2nd matrix===================//
		System.out.print("<<<<<<<<Enter 2nd Matrix>>>>>>>\n");
		System.out.print("Enter the elements for matrix 2nd");
				for(i=0; i<row; i++)
				{
					for( j=0; j<col; j++)
					{
						y[i][j]=n.nextInt();
				    }
			   }
//============FOR LOOP FOR PRINT 2ND MATRIX Y[][]==============//
	System.out.print("2nd matrix is : - \n");
	for(i=0; i<y.length; i++)
					{																			//<-----Starting outter loop//
						for(j=0; j<y[0].length; j++)
						{																		//<----Starting inner loop//
							System.out.print(y[i][j] + " ");
						}																		//<-----ending inner loop//
						System.out.println();
				}																				//ending outter loop

//=====================STARTING FOR LOOP FOR ADDTION ===============//
System.out.print("Addtion of above two matrix is : -\n");
					for(i=0; i<z.length; i++)
					{																			//<-----Starting outter loop//
						for(j=0; j<z[0].length; j++)
						{																		//<----Starting inner loop//
						    z [i][j] = x[i][j]+y[i][j];
						}																		//<-----ending inner loop//
				  }

				for(i=0; i<z.length; i++)
								{																			//<-----Starting outter loop//
									for(j=0; j<z[0].length; j++)
									{																		//<----Starting inner loop//
									   System.out.print(z[i][j] + " ");
									}																		//<-----ending inner loop//
									System.out.println();
									}
			}																					//ending main//
			}																			//ending class//
