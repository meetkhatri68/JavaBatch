package Module1;

import java.util.Scanner;

//Write a program to make a square and cube of number.
class square
{
	void display() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int a = sc.nextInt();
		System.out.println("Square is = "+a*a);
		System.out.println("Cube is = "+a*a*a);
	}
	
}
public class square_cube 
{	
	public static void main(String[] args) 
	{
		square s1 = new square();
		s1.display();
		
	}
}
