package Module1;

import java.util.Scanner;

//rite a Program to check the given year is leap year or not.

public class leap_year 
{
	public static void main(String[] args) 
	{
		Scanner lc = new Scanner(System.in);
		System.out.println("Enter Year = ");
		int Year = lc.nextInt();
		if (Year % 4==0) 
		{
			System.out.println("Leap Year");
		}
		else 
		{
			System.out.println("Not Leap Year");
		}
	}
}
