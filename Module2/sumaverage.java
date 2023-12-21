package Module2;

import java.util.Scanner;

//Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.

public class sumaverage 
{
	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number");
		int a = sc.nextInt();
		System.out.println("Enter The second Number");
		int b = sc.nextInt();
		System.out.println("Enter The third Number");
		int c = sc.nextInt();
		System.out.println("Enter The fourth Number");
		int d = sc.nextInt();
		System.out.println("Enter The fifth Number");
		int e = sc.nextInt();
		
		int total = a + b + c + d + e;
		System.out.println("Total: "+total);
		
		float average = total/5;
		System.out.println("Average: "+average);
	}
}
