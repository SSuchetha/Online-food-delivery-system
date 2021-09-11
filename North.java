package veg_foodie;
import java.io.*;
public class North 
{
	static void menu()throws IOException
	{
		int d;
		boolean exitmenu=false;
		System.out.println("Pls select a dish..");
		System.out.println("1. Aloo ki tikki");
		System.out.println("2. Bhatura");
		System.out.println("3. Dal fry with tadka");
		System.out.println("4. Kadhi pakoda");
		System.out.println("5. Shahi tukra");
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
					System.out.println("Aloo ki tikki cost is " +40);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Aloo ki tikki~", 40);
					MAIN.foodCount++;
					break;
				case 2:
					System.out.println("Bhatura cost is " +80);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Bhatura~", 80);
					MAIN.foodCount++;
					break;
				case 3:
					System.out.println("Dal fry with tadka cost is " +75);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Dal fry with tadka~", 75);
					MAIN.foodCount++;
					break;
				case 4:
					System.out.println("Kadhi pakoda cost is " +50);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Kadhi pakoda~", 50);
					MAIN.foodCount++;
					break;
				case 5:
					System.out.println("Shahi tukra cost is " +80);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Shahi tukra~", 80);
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