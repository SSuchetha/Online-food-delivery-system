package veg_foodie;
import java.io.*;
public class Lunch 
{
	static void choose()throws Exception
	{
		int d;
		char x;
		boolean exitmenu=false;
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("To choose Rice press R To choose bread press B To choose delicacies press D");
		x='z';
		try
		{
			x=b.readLine().toUpperCase().charAt(0);
			if(x!='R'&&x!='B'&&x!='D')
			{
				throw new Exception("Wrong option selected. Pls reselect");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error occurred ! \n"+e.getMessage());
		}
		Thread.sleep(1000);
		switch(x)
		{
		case 'R':
			System.out.println("Pls choose a dish");
			System.out.println("1. Pulao");
			System.out.println("2. Fried Rice");
			System.out.println("3. Ghee Rice");
			System.out.println("4. Biryani");
			System.out.println("5. Jeera Rice");
			System.out.println("6. Exit");
			do
			{
				exitmenu=true;
				BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
				d=Integer.parseInt(r.readLine());
				Thread.sleep(900);
				try
				{
					switch(d)
					{
					case 1:
						System.out.println("Pulao cost is " +145);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Pulao~", 145);
						MAIN.foodCount++;
						break;
					case 2:
						System.out.println("Fried Rice is " +160);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Fried Rice~", 160);
						MAIN.foodCount++;
						break;
					case 3:
						System.out.println("Ghee Rice cost is " +135);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Pulao~", 135);
						MAIN.foodCount++;
						break;
					case 4:
						System.out.println("Biryani cost is " +160);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Biryani~", 160);
						MAIN.foodCount++;
						break;
					case 5:
						System.out.println("Jeera Rice cost is " +130);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Jeera Rice~", 130);
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
		case 'B':
			System.out.println("Pls choose a dish");
			System.out.println("1. Roti and gobi curry");
			System.out.println("2. Naan and paneer curry");
			System.out.println("3. Paratha and achari sabzi");
			System.out.println("4. Kulcha and Navaratna Korma");
			System.out.println("5. Chapati and dal");
			System.out.println("6. Exit");
			do
			{
				exitmenu=true;
				BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
				int z=Integer.parseInt(r.readLine());
				try
				{
					switch(z)
					{
					case 1:
						System.out.println("Roti and gobi curry cost is " +150);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Roti and gobi curry~", 150);
						MAIN.foodCount++;
						break;
					case 2:
						System.out.println("Naan and paneer curry is " +150);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Naan and paneer curry~", 150);
						MAIN.foodCount++;
						break;
					case 3:
						System.out.println("Paratha and achari sabzi cost is " +140);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Paratha and achari sabzi~", 140);
						MAIN.foodCount++;
						break;
					case 4:
						System.out.println("Kulcha and Navaratna Korma cost is " +170);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Kulcha and Navaratna Korma~", 170);
						MAIN.foodCount++;
						break;
					case 5:
						System.out.println("Chapati and dal cost is " +120);
						MAIN.arrBilling[MAIN.foodCount]=new Billing();
						MAIN.arrBilling[MAIN.foodCount].addFood("Chapati and dal~", 120);
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
			break;
		case 'D':
			Delicacies.select();
			break;
		}
	}
}