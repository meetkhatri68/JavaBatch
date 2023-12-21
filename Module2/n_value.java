package Module2;

import java.util.Scanner;

//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Input number:

public class n_value 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int n = sc.nextInt();
		try 
		{
			System.out.printf("%d + %d%d +%d%d%d \n"+ n,n,n,n,n,n);
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
}
