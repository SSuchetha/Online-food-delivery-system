package veg_foodie;
import java.io.*;
public class Mexican 
{
	static void menu()throws IOException
	{
		int d;
		boolean exitmenu=false;
		System.out.println("Pls select a dish..");
		System.out.println("1. Mexican Pasta");
		System.out.println("2. Black Bean and Corn Quesadillas");
		System.out.println("3. Mexican Bean Burgers");
		System.out.println("4. Chilli Potato Burritos");
		System.out.println("5. 3 Cheese Enchilados");
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
					System.out.println("Mexican Pasta cost is " +120);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Mexican Pasta~", 120);
					MAIN.foodCount++;
					break;
				case 2:
					System.out.println("Black Bean and Corn Quesadillas cost is " +110);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Black Bean and Corn Quesadillas~", 110);
					MAIN.foodCount++;
					break;
				case 3:
					System.out.println("Mexican Bean Burgers cost is " +100);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Mexican Bean Burgers~", 100);
					MAIN.foodCount++;
					break;
				case 4:
					System.out.println("Chilli Potato Burritos cost is " +90);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Chilli Potato Burritos~", 90);
					MAIN.foodCount++;
					break;
				case 5:
					System.out.println("3 Cheese Enchilados cost is " +100);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("3 Cheese Enchilados~", 100);
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