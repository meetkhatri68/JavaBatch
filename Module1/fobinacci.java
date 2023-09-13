package Module1;

//Write a program you have to print the Fibonacci series up to user given number.

import java.util.Scanner;

public class fobinacci 
{
	public static void main(String[] args) 
	{
		int x,w,i;
		int y = 0;
		int z = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Fabonacci series limit: ");
		x = sc.nextInt();
		
		for(i=1; i<=x; i++)
		{
			System.out.println(y);
			w=y+z;
			y=z;
			z=w;
		}
	}
}
