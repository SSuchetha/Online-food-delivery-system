package veg_foodie;
import java.io.*;
public class Catering 
{
	static String s;
	static char ch;
	static void request()throws Exception
	{
		String address,date;
		int no=0;
		int occ;
		double rate=0.0d;
		double dcnt;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("To enjoy VEG FOODIE Catering Services \n*-*-*- Free of "
				+ "transportation, excess and time limit charges*-*-*-\n Enter C");
		s=br.readLine();
		ch=s.charAt(0);
		if(ch=='C'||ch=='c')
		{
			System.out.println("Please enter venue [Complete address]");
			address=br.readLine();
			System.out.println("Please enter date[FORMAT:DD/MM/YYYY]");
			boolean flag=true;
			try
			{
				date=br.readLine();
			}
			catch(Exception d)
			{
				System.out.println("-_- Date format Invalid");
			}
			System.out.println("Please enter number of members");
			boolean flag1=true;
			try
			{
				no=Integer.parseInt(br.readLine());
			}
			catch(Exception num)
			{
				System.out.println("Number exceeds production capacity. Please reconsider");
				flag1=false;
			}
			System.out.println("Please choose occassion\n1. Birthday\n2. Anniversary"
					+ "\n3. Farewell \n 4. House Warming\n 5. Get Together\n6.Exit");
			boolean exit=false;
			int i=1;
			while(exit==false && i==1)
			{
				occ=Integer.parseInt(br.readLine());
				switch(occ)
				{
				case 1:
				case 2:
				case 3:
				case 5:
					rate=calc_cater(no)+50*no;
					System.out.print("Cost is... ");
					Thread.sleep(100);
					System.out.println(rate);
					break;
				case 4: rate=calc_cater(no)+1*no;
						System.out.print("Cost is... ");
						Thread.sleep(100);
						System.out.println(rate);
						break;
				case 6:
					exit=true;
					System.out.println("Thank you");
					break;
				default: System.out.println("Check option");
				  		 throw new Exception();
				}
				i++;
			}
			if((rate>=2000)&&(rate<5000))
			{
				dcnt=rate-0.2*rate;
				System.out.println("Final charge is " +dcnt);
			}
			else if((rate>=5000)&&(rate<8000))
			{
				dcnt=rate-0.2*rate;
				dcnt=dcnt-0.15*rate;
				System.out.println("Final charge is " +dcnt);
			}
			else if(rate>=8000)
			{
				dcnt=rate-0.2*rate;
				dcnt=dcnt-0.15*rate;
				dcnt=dcnt-0.1*rate;
				System.out.println("Final charge is " +dcnt);
				System.out.println("CONGRATULATIONS!!!!\n You have won a chance to reserve"
						+ "a free seat at hotel of your choice");
				Booking nex=new Booking();
				nex.bookHotel();
			}
		}
		else
		{
			System.out.println("W@!T |^^|!\\UT3");
			MAIN.choose();
		}
	}
	static double calc_cater(int x)
	{
		int price=x*150;
		return price;
	}
}