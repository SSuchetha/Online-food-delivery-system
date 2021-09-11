package veg_foodie;
import java.io.*;
public class Booking 
{
	static int n;
	static String food_item;
	static int hotel;
	static void bookHotel()throws Exception
	{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("To reserve a table press 'r'");
		String w=r.readLine();
		char x=w.charAt(0);
		if(x=='r')
		{
			System.out.print("1. Krishna Grand, Banashankari, Bangalore");
			System.out.println("\t Booking~ Min-2 Max-10");
			System.out.print("2. Green, Padmanabhanagar, Bangalore");
			System.out.println("\t Booking~ Min-2 Max-10");
			System.out.print("3. Subz, Jayanagar, Bangalore");
			System.out.println("\t Booking~ Min-5 Max-30");
			System.out.print("4. 1947, Indiranagar, Bangalore");
			System.out.println("\t Booking~ Min-4 Max-10");
			System.out.print("5. Village, Central Mall, JP Nagar, Bangalore");
			System.out.println("\t Booking~ Min-5 Max-20");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			hotel=Integer.parseInt(br.readLine());
		}
		else
		{
			System.out.print("Thank You");
			MAIN.choose();
		}
		if(hotel>5)
		{
			System.out.println("Record does not exist. Pls reselect again");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			hotel=Integer.parseInt(br.readLine());
		}
		System.out.println("Please enter no of members");
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(b.readLine());
		if(n>10 && hotel==1)
		{
			System.out.println("Sorry. Cannot accomodate more than 10 members");
			System.out.println("Pls re-enter number of members");
			n=Integer.parseInt(b.readLine());
		}
		if(n>10 && hotel==2)
		{
			System.out.println("Sorry. Cannot accomodate more than 10 members");
			System.out.println("Pls re-enter number of members");
			n=Integer.parseInt(b.readLine());
		}
		if(n>30 && hotel==3)
		{
			System.out.println("Sorry. Cannot accomodate more than 10 members");
			System.out.println("Pls re-enter number of members");
			n=Integer.parseInt(b.readLine());
		}
		if(n>10 && hotel==4)
		{
			System.out.println("Sorry. Cannot accomodate more than 10 members");
			System.out.println("Pls re-enter number of members");
			n=Integer.parseInt(b.readLine());
		}
		if(n>20 && hotel==5)
		{
			System.out.println("Sorry. Cannot accomodate more than 10 members");
			System.out.println("Pls re-enter number of members");
			n=Integer.parseInt(b.readLine());
		}
		else
			Final();
	}
	static void Final()throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter date please in the format DD/MM/YYYY");
		String date=br.readLine();
		System.out.println("Your booking reference is " +(int)Math.ceil(Math.random()*100));
		System.out.println("Generating customer coupon code.......");
		Thread.sleep(1500);
		System.out.println("Scanning coupon eligibility......");
		Thread.sleep(3500);
		System.out.println(date);
		System.out.println("****//\n This code is an entry oass. \n Do not discard. \n Making duplicates of such copies is punishable by law.\n\\\\****");
	}
}
