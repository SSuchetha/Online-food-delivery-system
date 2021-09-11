package veg_foodie;
import java.io.*;
public class Thai 
{
	static void menu()throws IOException
	{
		int d;
		boolean exitmenu=false;
		System.out.println("Pls select a dish..");
		System.out.println("1. Thai Rice");
		System.out.println("2. Thai Tofu Vegetables");
		System.out.println("3. Phrik nu chillies");
		System.out.println("4. Galangal");
		System.out.println("5. Thai Chilli Brocolli Salad");
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
					System.out.println("Thai Rice cost is " +120);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Thai Rice~", 120);
					MAIN.foodCount++;
					break;
				case 2:
					System.out.println("Thai Tofu Vegetables cost is " +70);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Thai Tofu Vegetables~", 70);
					MAIN.foodCount++;
					break;
				case 3:
					System.out.println("Phrik nu chillies cost is " +70);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Phrik nu chillies~", 70);
					MAIN.foodCount++;
					break;
				case 4:
					System.out.println("Galangal cost is " +120);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Galangal~", 120);
					MAIN.foodCount++;
					break;
				case 5:
					System.out.println("Thai Chilli Brocolli Salad cost is " +110);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Thai Chilli Brocolli Salad~", 110);
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
