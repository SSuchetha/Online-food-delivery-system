package veg_foodie;
import java.io.*;
public class Italian 
{
	static void menu()throws IOException
	{
		int d;
		boolean exitmenu=false;
		System.out.println("Pls select a dish..");
		System.out.println("1. Bruschetta");
		System.out.println("2. Four Cheese Pasta");
		System.out.println("3. Spinach Lasagna Roll-Ups");
		System.out.println("4. Lighter Baked Macaroni & Cheese with Spinach & Red Peppers");
		System.out.println("5. Italiano special pizza");
		System.out.println("6. Exit");
		do
		{
			exitmenu=true;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			try
			{
				d=Integer.parseInt(br.readLine());
				switch(d)
				{
				case 1:
					System.out.println("Bruschetta cost is " +100);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Bruschetta~", 100);
					MAIN.foodCount++;
					break;
				case 2:
					System.out.println("Four Cheese Pasta cost is " +130);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Four Cheese Pasta~", 130);
					MAIN.foodCount++;
					break;
				case 3:
					System.out.println("Spinach Lasagna Roll-Ups cost is " +115);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Spinach Lasagna Roll-Ups~", 115);
					MAIN.foodCount++;
					break;
				case 4:
					System.out.println("Lighter Baked Macaroni & Cheese with Spinach & Red Peppers cost is " +105);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Lighter Baked Macaroni & Cheese with Spinach & Red Peppers~", 105);
					MAIN.foodCount++;
					break;
				case 5:
					System.out.println("Italiano special pizza cost is " +120);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Italiano special pizza~", 120);
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
				exitmenu=true;
				System.out.println("Error occurred~\n" + e.getMessage());
			}
		}while(exitmenu);
	}
}