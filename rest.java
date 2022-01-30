import java.util.Scanner;

class rest
{
	public static void main(String[] arg)
	{
		enter e=new enter();
		e.name();
		System.out.println("\n===============================");
		e.menu();
		System.out.println("\n===============================");
		e.showname();
		System.out.println("\n===============================");
		e.finalmenu();
		System.out.println("\n===============================");
		System.out.print("WANT TO REMOVE SOMETHING...\n1. yes\n2. no        " );
		Scanner c=new Scanner(System.in);
		int choice=c.nextInt();
		if(choice==1)
		{
			e.edit();
			System.out.print("THANKS FOR BEING WITH US...");
		}
		else
		{
			System.out.print("THANKS FOR BEING WITH US...");
		}	
	}
}

class enter
{
	Scanner s=new Scanner(System.in);
	String name;
	long cno;
	double namount=0;
	int ans,count=0,pizza=0,burger=0,idly=0,colddrinks=0,momos=0,pastry=0,qty=0;
	public void name()
	{

		System.out.print("Enter Name : ");
		name=s.nextLine();
		System.out.print("Enter Contact Number : ");
		cno=s.nextLong();
	}
	public void menu()
	{
		do{
			do{
				System.out.print("\n\t\tMENU\n");
				System.out.print("\n1]PIZZA\t\t\tRs-100\n2]BURGER\t\tRs-50\n3]PASTRY\t\tRs-30\n4]MOMOS\t\t\tRs-40\n5]IDLY\t\t\tRs-150\n6]COLD DRINKS\t\tRs-80\n7]EXIT\t\t\n\n");
				System.out.print("\nENTER CHOICE :    ");
				count=s.nextInt();
				if(count==1)
				{
					pizza++; qty++;
					System.out.print("\nPIZZA  "+pizza);
					double amt=100*pizza;
					System.out.print("\nAmount ="+amt);					
				}
				else if(count==2)
				{
					burger++; qty++;
					System.out.print("\nBURGER  "+burger);
					double amt=50*burger;
					System.out.print("\nAmount ="+amt);
				}
				else if(count==3)
				{
					pastry++; qty++;
					System.out.print("\nPASTRY  "+pastry);
					double amt=30*pastry;
					System.out.print("\nAmount ="+amt);
				}
				else if(count==4)
				{
					momos++; qty++;
					System.out.print("\nMOMOS  "+momos);
					double amt=40*momos;
					System.out.print("\nAmount ="+amt);
				}
				else if(count==5)
				{
					idly++; qty++;
					System.out.print("\nIDLY  "+idly);
					double amt=150*idly;
					System.out.print("\nAmount ="+amt);
				}
				else if(count==6)
				{
					colddrinks++; qty++;
					System.out.print("\nCOLD DRINKS "+colddrinks);
					double amt=100*colddrinks;
					System.out.print("\nAmount ="+amt);
				}
				else
				{
					System.out.print("INVALID CHOICE...");
				}
			}while(count!=7);
			System.out.print("\nWant To Add Something More\n1. continue\n2.exit...        ");
			ans=s.nextInt();
		}while(ans!=2);
	}
	public void finalmenu()
	{
		System.out.println("\nTHE FINAL MENU IS : ");
		if(pizza>=1)
		{
			System.out.print("\nMENU SELECTED : PIZZA        TOTAL QUANTITY : ");
			System.out.print(pizza);
			System.out.print("   Amount ="+100*pizza);

		}
		if(burger>=1)
		{	System.out.print("\nMENU SELECTED : BURGER       TOTAL QUANTITY : ");
			System.out.print(burger);
			System.out.print("   Amount ="+50*burger);
		}
		if(pastry>=1)
		{	System.out.print("\nMENU SELECTED : PASTRY       TOTAL QUANTITY : ");
			System.out.print(pastry);
			System.out.print("   Amount ="+30*pastry);
		}
		if(momos>=1)
		{	System.out.print("\nMENU SELECTED : MOMOS        TOTAL QUANTITY : ");
			System.out.print(momos);
			System.out.print("   Amount ="+40*momos);
		}
		if(idly>=1)
		{	System.out.print("\nMENU SELECTED : IDLY         TOTAL QUANTITY : ");
			System.out.print(idly);
			System.out.print("   Amount ="+150*idly);
		}
		if(colddrinks>=1)
		{	System.out.print("\nMENU SELECTED : COLD DRINKS  TOTAL QUANTITY : ");
			System.out.print(colddrinks);
			System.out.print("   Amount ="+80*colddrinks);
		}
		System.out.print("\n\nTHE TOTAL QUANTITY IS  : ");
		System.out.print(qty);
		namount=pizza*100+burger*50+idly*150+colddrinks*80+momos*40+pastry*30;
		System.out.println("\n\nTOTAL  AMOUNT           : "+namount+" Rs");

	}
	public void showname()
	{
		System.out.println("\n===============================");
		System.out.print("\nCUSTOMER NAME  : "+name);
		System.out.print("\nCONTACT NUMBER : "+cno);
		System.out.println("\n===============================");
	}
	public void edit()
	{
		System.out.println("\n===============================");
		finalmenu();
		System.out.println("\n===============================");
		System.out.print("WHICH ONE YOU HAVE TO REMOVE     ");
		do{
			System.out.print("\n1]PIZZA\t\t\tRs-100\n2]BURGER\t\tRs-50\n3]PASTRY\t\tRs-30\n4]MOMOS\t\t\tRs-40\n5]IDLY\t\t\tRs-150\n6]COLD DRINKS\t\tRs-80\n7]EXIT\t\t\n\n");
			System.out.print("\nENTER CHOICE :    ");
			count=s.nextInt();
			if(count==1)
				{
					pizza--; qty--;
					System.out.print("\nPIZZA  "+pizza);
					double amt=100*pizza;
					namount=namount-amt;
				}
				else if(count==2)
				{
					burger--; qty--;
					System.out.print("\nBURGER  "+burger);
					double amt=50*burger;
					namount=namount-amt;
				}
				else if(count==3)
				{
					pastry--; qty--;
					System.out.print("\nPASTRY  "+pastry);
					double amt=30*pastry;
					namount=namount-amt;
				}
				else if(count==4)
				{
					momos--; qty--;
					System.out.print("\nMOMOS  "+momos);
					double amt=40*momos;
					namount=namount-amt;
				}
				else if(count==5)
				{
					idly--; qty--;
					System.out.print("\nIDLY  "+idly);
					double amt=150*idly;
					namount=namount-amt;
				}
				else if(count==6)
				{
					colddrinks--; qty--;
					System.out.print("\nCOLD DRINKS "+colddrinks);
					double amt=100*colddrinks;
					namount=namount-amt;
				}
				else 
				{
					System.out.print("INVALID CHOICE...");
				}
		}while(count!=7);
		System.out.println("\n===============================");
		finalmenu();
	}
}