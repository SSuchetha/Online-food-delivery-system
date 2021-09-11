package veg_foodie;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Helper 
{
	public static String getString()throws Exception
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		return b.readLine();
	}
	public static String getString(String question)throws Exception
	{
		System.out.println(question);
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		return b.readLine();
	}
	public static int getInt(String question)throws Exception
	{
		System.out.println(question);
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(b.readLine());
	}
	public static int getInt()throws Exception
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(b.readLine());
	}
}
