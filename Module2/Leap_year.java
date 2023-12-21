package Module2;

import java.util.Scanner;

//Write a Java program that takes a year from user and print whether that year is a leap year or not.

public class Leap_year 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Year: ");
		int year = sc.nextInt();
		
		if(year % 4 == 0)
		{
			System.out.println("Leap Year.");
		}
		else
		{
			System.out.println("Not Leap Year.");
		}
	}
}
