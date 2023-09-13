package Module1;

import java.util.Scanner;

public class max_number 
{
	public static void main(String[] args) 
	{
		int largest = 0;
		int smallest = 9;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int a = sc.nextInt();
		while(a>0)
		{
			int digit = a % 10;
			largest = Math.max(largest, digit);
			smallest = Math.min(smallest, digit);
			 a = a / 10;
		}
		System.out.println("Your Largest Number is "+largest);
		System.out.println("Your Smallest Number is "+smallest);
	}
}
