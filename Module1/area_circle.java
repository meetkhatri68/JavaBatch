package Module1;

import java.util.Scanner;

//Write a program to find the Area of Circle.

public class area_circle 
{
	public static void main(String[] args) 
	{
		Scanner ac = new Scanner(System.in);
		System.out.println("Enter The Radius of Circle = ");
		float R = ac.nextFloat();
		System.out.println("Enter The Value of PI = ");
		float PI = ac.nextFloat();
		System.out.println("Area of Circle is = "+PI * R * R);
	}
	
	
}
