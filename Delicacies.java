package veg_foodie;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Delicacies 
{
	static void select()throws IOException
	{
		String d="";
		boolean exitmenu=false;
		System.out.println("South Indian press 'S'\nNorth Indian press 'N'\nThai press'T'"
				+ "\nChinese press 'C'\nItalian press 'I'\nMexican press 'M'");
		System.out.println("Press E to exit");
		do
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			try
			{
				d=br.readLine().toUpperCase();
				switch(d)
				{
				case "S":
					System.out.println("South menu selected");
					South.menu();
					break;
				case "N":
					System.out.println("North menu selected");
					North.menu();
					break;
				case "T":
					System.out.println("Thai menu selected");
					Thai.menu();
					break;
				case "C":
					System.out.println("Chinese menu selected");
					Chinese.menu();
					break;
				case "I":
					System.out.println("Italian menu selected");
					Italian.menu();
					break;
				case "M":
					System.out.println("Mexican menu selected");
					Mexican.menu();
					break;
				case "E":
					exitmenu=false;
					System.out.println("You chose to exit...");
					break;
				default:
					throw new Exception("Wrong option selected. Pls reselect");
				}
			}
			catch(Exception e)
			{
				System.out.println("Error occurred ~\n"+e.getMessage());
				exitmenu=true;
			}
		}while(exitmenu);
	}
}