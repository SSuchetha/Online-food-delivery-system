package veg_foodie;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
public class Billing 
{
	String foodName;
	int foodCost;
	void viewBilling()
	{
		MAIN.arrBilling=new Billing[99];
	}
	void addFood(String fName,int fCost)
	{
		foodName=fName;
		foodCost=fCost;
	}
	static void print()throws Exception
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		for(int sc=1;sc<=10;sc++)
		{
			System.out.print("||||||||");
			Thread.sleep(500);
		}
		System.out.println();
		System.out.println("Generating bill...");
		for(int sc=1;sc<=10;sc++)
		{
			System.out.print("|||||||");
			Thread.sleep(500);
		}
		int totalAmount=0;
		SimpleDateFormat sdfDate=new SimpleDateFormat("dd~MMM~yyyy HH:mm:ss");
		Date now=new Date();
		System.out.println("__________________________--");
		System.out.println("\t\tVEG FOODIE, BANGALORE");
		System.out.println("\t\t"+sdfDate.format(now)+"\n");
		int tn=0;
		for(int item=0; item<99; item++)
		{
			try
			{
				StringBuilder builder=new StringBuilder(MAIN.arrBilling[item].foodName);
				while(builder.length()<30)
						builder.append(' ');
				System.out.print(builder.toString());
				System.out.println(MAIN.arrBilling[item].foodCost);
				totalAmount+=MAIN.arrBilling[item].foodCost;
			}
			catch(Exception e)
			{
				break;
			}
			tn=item;
		}
		System.out.println("________________________________");
		System.out.println("TOTAL BILL AMOUNT "+totalAmount);
		if(tn>=1)
			System.out.println("Your order will reach you in 30-60 minutes");
	}
}