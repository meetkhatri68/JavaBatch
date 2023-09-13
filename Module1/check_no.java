package Module1;

import java.util.Scanner;

//Write a Program to check the given number is Positive, Negative.


public class check_no 
{
	public static void main(String[] args) 
	{
		Scanner cn = new Scanner(System.in);
		System.out.println("Enter The Number = ");
		int NO = cn.nextInt();
		if (NO > 0) 
		{
			System.out.println("Its Positive Number");
		}
		else if (NO < 0) 
		{
			System.out.println("Its Negative Number");
		} 
		else 
		{
			System.err.println("Is a Zero");
		}
	}
}
