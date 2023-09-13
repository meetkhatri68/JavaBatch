package Module1;

import java.util.Scanner;

//Write a program to print the number in reverse order.

public class reverse_loop 
{
	public static void main(String[] args) 
	{
		int b,a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		a = sc.nextInt();
		
		while(a>0)
		{
 			b=a%10;
 			System.out.println(b);
			a=a/10;
		}
	}
}
