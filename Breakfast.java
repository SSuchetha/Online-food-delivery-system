package veg_foodie;
public class Breakfast 
{
	static void list()throws Exception
	{
		int d;
		boolean exitmenu=false;
		String menu="Pls choose a dish\n1.Sandwich Ketup\n2.Oatmeal\n3.Dosa Chutney\n4.Idly Sambhar"
				+ "\n5.Poha\n6.Exit";
		System.out.println(menu);
		do
		{
			exitmenu=true;
			try
			{
				d=Helper.getInt();
				Thread.sleep(1200);
				switch(d)
				{
				case 1:
					System.out.println("Sandwich Ketchup cos is "+35);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Sandwich Ketchup~",35);
					MAIN.foodCount++;
					break;
				case 2:
					System.out.println("Oatmeal cost is " + 45);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Oatmeal~",45);
					MAIN.foodCount++;
					break;
				case 3:
					System.out.println("Dosa chutney cost is " + 50);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Dosa chutney~",50);
					MAIN.foodCount++;
					break;
				case 4:
					System.out.println("Idly sambhar cost is " + 40);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Idly chutney~",40);
					MAIN.foodCount++;
					break;
				case 5:
					System.out.println("Poha cost is " + 35);
					MAIN.arrBilling[MAIN.foodCount]=new Billing();
					MAIN.arrBilling[MAIN.foodCount].addFood("Poha~",35);
					MAIN.foodCount++;
					break;
				case 6:
					exitmenu=false;
					System.out.println("You choose to exit.....");
					break;
				default:
					throw new Exception("Wrong option selected. Pls reselct");
				}
			}
			catch(Exception e)
			{
				System.out.println("Error occurred~\n"+e.getMessage());
			}
		}while(exitmenu);
	}
}