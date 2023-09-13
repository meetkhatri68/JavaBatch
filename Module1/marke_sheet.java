package Module1;

//Write a program to calculate sum of 5 subjects & find the percentage.
//Subject marks entered by user.

import java.util.Scanner;

public class marke_sheet 
{
	String name;
	int maths,science,gujarati,english,hindi,sum;
	float percentage;
	void input()
	{
		
		Scanner nm = new Scanner(System.in);
		System.out.println("\nEnter The name: ");
		name = nm.nextLine();
	}
	void subject()
	{
		
		System.out.println("\nEnter your marks (out of 100) for given subject");
		Scanner sb = new Scanner(System.in);
		System.out.println("Maths: ");
		maths = sb.nextInt();
		System.out.println("science: ");
		science = sb.nextInt();
		System.out.println("Gujarati: ");
		gujarati = sb.nextInt();
		System.out.println("English: ");
		english = sb.nextInt();
		System.out.println("Hindi: ");
		hindi = sb.nextInt();	
	}
	void total()
	{
		sum = maths + science + gujarati + english + hindi;
		System.out.println("Total Marks: "+sum);
		percentage = sum/5;
		System.out.println("Percentage: "+percentage);
		if(percentage > 90)
		{
			System.out.println("Distinction");
		}
		else if(percentage < 75)
		{
			System.out.println("First Class");
		}
		else if(percentage < 60)
		{
			System.out.println("Second Class");
		}
		else if(percentage < 40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) 
	{
		marke_sheet ms = new marke_sheet();
		ms.input();
		ms.subject();
		ms.total();
	}
}
