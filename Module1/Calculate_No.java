package Module1;

//Write a program to make addition, Subtraction, Multiplication and Division of Two Numbers.

import java.util.Scanner;

public class Calculate_No 
{
	
	public static void main(String[] args) 
	{
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Your First Number: ");
		int a = sc.nextInt();
		
		System.out.println("\nEnter Your Second Number: ");
		int b = sc.nextInt();
		
		result=a+b;
		System.out.println("Addition = "+result);
		
		result=a-b;
		System.out.println("Substraction = "+result);
		
		result=a/b;
		System.out.println("Division = "+result);
	}
}
