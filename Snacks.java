package veg_foodie;
import java.io.*;
public class Snacks 
{
	static void list()throws Exception
	{
		boolean exitmenu=false;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("To choose Fried press F. To choose baked press B");
		char x=br.readLine().toUpperCase().charAt(0);
		Thread.sleep(1200);
		try
		{
			if(x!='F' && x!='B')
				throw new Exception("Wrong option selected. Pls reselect");
		}
		catch(Exception e)
		{
			System.out.println("Error occurred~\n"+e.getMessage());
		}
		System.out.println("Processing..");
		Thread.sleep(1000);
		switch(x)
		{
		case 'B':
			System.out.println("Pls select a dish..");
			System.out.println("1. Cake");
			System.out.println("2. Pastires");
			System.out.println("3. Biscuit");
			System.out.println("4. Puffs");
			System.out.println("5. Nachos");
			System.out.println("6. Exit");
			do
			{
				exitmenu=true;
				BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
				int	y=Integer.parseInt(r.readLine());
				try
				{
					switch(y)
					{
					case 1:
						System.out.println("Cake cost is " +150);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Cake~", 150);
						MAIN.foodCount++;
						break;
					case 2:
						System.out.println("Pastires cost is " +100);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Pastires~", 100);
						MAIN.foodCount++;
						break;
					case 3:
						System.out.println("Biscuit cost is " +90);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Biscuit~", 90);
						MAIN.foodCount++;
						break;
					case 4:
						System.out.println("Puffs cost is " +95);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Puffs~", 95);
						MAIN.foodCount++;
						break;
					case 5:
						System.out.println("Nachos cost is " +85);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Nachos~", 85);
						MAIN.foodCount++;
						break;
					case 6:
						exitmenu=false;
						System.out.println("You chose to exit");
						MAIN.choose();
						break;
					default:
						throw new Exception("Wrong option selected. Pls reselect");
					}
				}
				catch(Exception e)
				{
					System.out.println("Error occurred~\n" + e.getMessage());
				}
			}while(exitmenu);
			break;
		case 'F':
			System.out.println("Pls select a dish..");
			System.out.println("1. French Fries");
			System.out.println("2. Nuggets");
			System.out.println("3. Chips");
			System.out.println("4. Samosa");
			System.out.println("5. Kachori");
			System.out.println("6. Exit");
			do
			{
				exitmenu=true;
				BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
				int	z=Integer.parseInt(r.readLine());
				try
				{
					switch(z)
					{
					case 1:
						System.out.println("French Fries cost is " +70);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("French Fries~", 70);
						MAIN.foodCount++;
						break;
					case 2:
						System.out.println("Nuggets cost is " +80);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Nuggets~", 80);
						MAIN.foodCount++;
						break;
					case 3:
						System.out.println("Chips cost is " +40);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Chips~", 40);
						MAIN.foodCount++;
						break;
					case 4:
						System.out.println("Samosa cost is " +50);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Samosa~", 50);
						MAIN.foodCount++;
						break;
					case 5:
						System.out.println("Kachori cost is " +50);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Kachori~", 50);
						MAIN.foodCount++;
						break;
					case 6:
						exitmenu=false;
						System.out.println("You chose to exit");
						MAIN.choose();
						break;
					default:
						throw new Exception("Wrong option selected. Pls reselect");
					}
				}
				catch(Exception e)
				{
					System.out.println("Error occurred~\n" + e.getMessage());
				}
			}while(exitmenu);
		}
	}
}