package Module2;

import java.util.Scanner;

//Write a program in Java to display the first 10 natural numbers using while loop.

public class Natural_No 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int No = sc.nextInt();
		
		while(i <= No)
		{
			sum = sum + i;
			i++;
		}
		System.out.println("Natural No."+sum);
	}
}
