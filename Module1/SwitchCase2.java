package Module1;

import java.util.Scanner;

//Write a Program of Addition, Subtraction ,Multiplication and Division using
//switch (Must Be Menu Driven)

public class SwitchCase2 
{
	public static void main(String[] args) 
	{
		int Choice,no1,no2;
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter The First Number: ");
		no1 = ch.nextInt(); 
		System.out.println("Enter The Second Number: ");
		no2 = ch.nextInt();
		
		System.out.println("Press 1 For Addition");
		System.out.println("Press 2 For Subtraction");
		System.out.println("Press 3 For Multiplication");
		System.out.println("Press 4 For Division");
		Choice = ch.nextInt();
		System.out.println("Enter Your Choice: ");
		
		switch(Choice)
		{
		case 1: System.out.println("Addition: "+(no1+no2));
		break;
		case 2: System.out.println("Substraction: "+(no1-no2));
		break;
		case 3: System.out.println("Multiplaction: "+(no1*no2));
		break;
		case 4: System.out.println("Division: "+(no1/no2));
		break;
		default: System.out.println("You Have Enter Worng Choice");
		break;
		}
	}
}
