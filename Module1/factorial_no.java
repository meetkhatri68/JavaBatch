package Module1;

import java.util.Scanner;

public class factorial_no 
{
	public static void main(String[] args) 
	{
		int a,i;
		int fact = 1;
		Scanner fc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		a = fc.nextInt();
		System.out.println("Factorial of "+a+" is");
		for(i = 1; i<=a; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial: "+fact);
	}
}
