package veg_foodie;
import java.io.*;
class MAIN 
{
	static String name;
	static String Address;
	static long phno;
	static int foodCount=0;
	static Billing arrBilling[]=new Billing[99];
	
	static void print()throws Exception
	{
		System.out.println("\t\tW     W  EEE  L     CCCC    O    M     M  EEE");
		System.out.println("\t\tW     W  E    L     C      O O   M M M M  E");
		System.out.println("\t\tW  W  W  EEE  L     C     O   O  M  M  M  EEE");
		System.out.println("\t\tW W W W  E    L     C      O O   M     M  E");
		System.out.println("\t\tW     W  EEE  LLLL  CCCC    O    M     M  EEE");
		
		System.out.println("\n\t\t\t\t    TTT  O");
		System.out.println("\t\t\t\t     T  O O");
		System.out.println("\t\t\t\t     T O   O");
		System.out.println("\t\t\t\t     T  O O");
		System.out.println("\t\t\t\t     T   O");
		
		System.out.println();
		
		System.out.println("\t\tV       V EEE    G    FFFF   O      O    D  III EEE");
		System.out.println("\t\t V     V  E    G      FFFF  O O    O O   DD  I  E");
		System.out.println("\t\t  V   V   EEE  G      F    O   O  O   O  DD  I  E");
		System.out.println("\t\t   V V    E     G GG  F     O O    O O   DD  I  E");
		System.out.println("\t\t    V     EEE    GGG  F      O      O    D  III EEE");
		
		Thread.sleep(2000);
		System.out.println("\n\nLOADING PAGE....\t PLEASE WAIT");
		Thread.sleep(3000);
		System.out.println("\t\tWelcome!!!\nWe extend you a hearty welcome to VEG FOODIE");
		System.out.print("VEG FOODIE aims at providing qualitative PURE VEGETARIAN FOOD");
		System.out.println("to all its customers");
		System.out.println("Please feel free and enjoy out best services");
	}
	
	static void choose()throws Exception
	{
		boolean exitmenu=true;
		Thread.sleep(2000);
		while(exitmenu)
		{
			String menu="\n To view menu press M \nTo order vegetarian food press O \n To reserve a seat in a hotel press R"
					+ "\n To choose Bill Print press P \n To get catering services press C \n Press E to exit";
			try
			{
				char c=Helper.getString(menu).toUpperCase().trim().charAt(0);
				Thread.sleep(500);
				switch(c)
				{
				case 'M':
					Menu.main(null);
					break;
				case 'O':
					String subMenu="To choose breakfast press \"B\"\n To choose lunch press \"L\"\n"
							+ "To choose snacks press \"S\"\n To choose dinner press \"D";
					char subChoice=Helper.getString(subMenu).toUpperCase().trim().charAt(0);
					if(subChoice=='B')
					{
						System.out.println("PROCESSING...");
						Thread.sleep(1000);
						Breakfast.list();
					}
					if(subChoice=='L')
					{
						System.out.println("PROCESSING...");
						Thread.sleep(1000);
						Lunch.choose();
					}
					if(subChoice=='S')
					{
						System.out.println("PROCESSING...");
						Thread.sleep(1000);
						Snacks.list();
					}
					if(subChoice=='D')
					{
						System.out.println("PROCESSING...");
						Thread.sleep(1000);
						Dinner.prepare();
					}
					break;
				case 'R':
					System.out.println("PROCESSING...");
					Thread.sleep(1000);
					Booking.bookHotel();
					break;
				case 'C':
					System.out.println("PROCESSING...");
					Thread.sleep(1000);
					Catering.request();
					break;
				case 'P':
					System.out.println("PROCESSING...");
					Thread.sleep(1000);
					Billing.print();
					arrBilling=new Billing[99];
					exitmenu=false;
					System.out.println(":):):):):)Thank you(:(:(:(:(:");
					break;
				case 'E':
					System.out.println("______Thank you!______\n_____VISIT AGAIN____");
					exitmenu=false;
					break;
				default:
					throw new Exception("Wrong entry. Please enter your correct choice");
				}
			}
			catch(Exception e)
			{
				System.out.println("Error occurred. \n"+e.getMessage());
				exitmenu=true;
			}
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			print();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			boolean flag=true;
			System.out.println("Please enter your name");
			do
			{
				try
				{
					name=br.readLine();
					name=name.toUpperCase();
					for(int i=0;i<name.length();i++)
					{
						if((name.charAt(i)>=65)&&(name.charAt(i)<=90))
							continue;
						else
						{
							throw new Exception("There is an error. \n Try entering first name"
									+ "without any spaces or special characerts.");
						}
					}
					flag=false;
				}
				catch(Exception e)
				{
					System.out.println("Enter again\n"+e.getMessage());
					flag=true;
				}
			}while(flag);
			boolean flag_=true;
			System.out.println("Please enter 8 digit landline number");
			do
			{
				try
				{
					phno=Long.parseLong(br.readLine());
					if((phno<20000000)||(phno>30000000))
						throw new Exception("Please re-enter");
					flag_=false;
				}
				catch(Exception e)
				{
					System.out.println("Phone number not traceable in city or in unreachable condition."
							+e.getMessage());
					flag_=true;
				}
			}while(flag_);
			System.out.println("Please enter address");
			Address=br.readLine();
			System.out.println("Name:"+name+"\nPhone number:"+phno+"\nAddress:"+Address);
			choose();
		}
		catch (Exception e)
		{
			System.out.println("Error!!!");
		}
	}
}
