package Module1;

import java.util.Scanner;

//Write a Program to check the given number is prime or not prime.

public class prime_notprime 
{
	public static void main(String[] args) 
	{
		int i, count, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weither the Number is Prime Or not");
		count = sc.nextInt();
		for(i = 2; i < count; i++)
		{
			if (count % i == 0) 
			{
				flag=1;
			}
			
		}
		if (flag == 0) 
		{
			System.out.println("Prime Number");
		}
		else 
		{
			System.out.println("Not A Prime Number");
		}
				
	}
}
