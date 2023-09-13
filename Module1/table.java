package Module1;

import java.util.Scanner;

//write a program you have to print the table of given number.\

public class table 
{
	public static void main(String[] args) 
	{
		int num,i;
		Scanner tc = new Scanner(System.in);
		System.out.println("Enter tabe Number: ");
		num = tc.nextInt();
		
//		while(i<=10)
//		{
//			System.out.println(num*i);
//			i++;
//			
//		}
		for(i=1; i<=10; i++)
		{
			System.out.println(num*i);
		}
	}
}
