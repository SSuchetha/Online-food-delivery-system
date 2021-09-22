package veg_foodie;
import java.io.*;
public class Chinese 
{
	static void menu()throws IOException
	{
		int d;
		boolean exitmenu=false;
		System.out.println("Pls select a dish..");
		System.out.println("1. Schezwan Noodles");
		System.out.println("2. Gobi Manchurian");
		System.out.println("3. Fried Rice");
		System.out.println("4. Momos");
		System.out.println("5. Chowmein");
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
					System.out.println("Schezwan Noodles cost is " +180);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Schezwan Noodles~", 180);
					MAIN.foodCount++;
					break;
				case 2:
					System.out.println("Gobi Manchurian cost is " +100);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Gobi Manchurian~", 100);
					MAIN.foodCount++;
					break;
				case 3:
					System.out.println("Fried Rice cost is " +160);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Fried Rice~", 160);
					MAIN.foodCount++;
					break;
				case 4:
					System.out.println("Momos cost is " +80);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Momos~", 80);
					MAIN.foodCount++;
					break;
				case 5:
					System.out.println("Chowmein cost is " +80);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Chowmein~", 80);
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
