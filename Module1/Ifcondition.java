package Module1;

import java.util.Scanner;

//Write a program of to find out the Area of Triangle, Rectangle and Circle
//using If Condition.(Must Be Menu Driven)

public class Ifcondition 
{
	public static void main(String[] args) 
	{
		int Choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 For Area Of Triangle");
		System.out.println("Press 2 For Area Of Rectangle");
		System.out.println("Press 3 For Area Of Circle");
		System.out.println("Choose The Shape to Find Its Area: ");
		Choice = sc.nextInt();
		
		if(Choice == 1)
		{
			System.out.println("Enter The Value Of Base: ");
			int base = sc.nextInt();
			System.out.println("Enter The Value Of Hight: ");
			int hight = sc.nextInt();
			System.out.println("Area Of Triangle: "+(base * hight)/2);
		}
		if(Choice == 2)
		{
			System.out.println("Enter The Value of Length: ");
			int Length = sc.nextInt();
			System.out.println("Enter The Value Of Width: ");
			int Width = sc.nextInt();
			System.out.println("Area Of Rectangle: "+(Length * Width));
		}
		if(Choice == 3)
		{
			float pi = (float) 3.14;
			System.out.println("Enter The Value Of Radius: ");
			float Radius = sc.nextFloat();
			System.out.println("Area Of Circle: "+(pi * Radius * Radius));
		}
		else
		{
			System.out.println("You Have Enter Invalid Number.");
		}
	}
	
}
