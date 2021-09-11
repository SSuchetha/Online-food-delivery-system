package veg_foodie;
import java.io.*;
public class South 
{
	static void menu()throws IOException
	{
		int d;
		boolean exitmenu=false;
		System.out.println("Pls select a dish..");
		System.out.println("1. Rasam Rice");
		System.out.println("2. Poori Saagu");
		System.out.println("3. Bisi Bele Bath");
		System.out.println("4. Khara bath");
		System.out.println("5. Curd Rice with Uppinkayi");
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
					System.out.println("Rasam Rice cost is " +100);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Rasam Rice~", 100);
					MAIN.foodCount++;
					break;
				case 2:
					System.out.println("Poori Saagu cost is " +90);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Poori Saagu~", 90);
					MAIN.foodCount++;
					break;
				case 3:
					System.out.println("Bisi Bele Bath cost is " +120);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Bisi Bele Bath~", 120);
					MAIN.foodCount++;
					break;
				case 4:
					System.out.println("Khara bath cost is " +80);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Khara bath~", 80);
					MAIN.foodCount++;
					break;
				case 5:
					System.out.println("Curd Rice with Uppinkayi cost is " +100);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Curd Rice with Uppinkayi~", 100);
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