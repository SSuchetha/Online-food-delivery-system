package veg_foodie;
public class Dinner 
{
	static String c;
	static boolean prepare()throws Exception
	{
		System.out.println("We have a famous saying to eat minimum for dinner.");
		System.out.println("Hence we bring to you a simple thali with cooked vegetables and rice");
		System.out.println("You also get a range of Indian bread with dal and paneer");
		System.out.println("You may conclude with a pudding.");
		System.out.println("Cost is 150.00");
		MAIN.arrBilling[MAIN.foodCount]=new Billing();
		MAIN.arrBilling[MAIN.foodCount].addFood("Dinner~",150);
		MAIN.foodCount++;
		return true;
	}
}
