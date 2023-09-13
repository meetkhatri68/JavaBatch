package Module1;
//Write a program to find the Area of Triangle.

import java.util.Scanner;

public class area_triangle 
{
	public static void main(String[] args) 
	{
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the base of triangle = ");
		int b = st.nextInt();
		System.out.println("Enter the hight of tringle = ");
		int h = st.nextInt();
		
		System.out.println("Area of triangle = "+(b * h)/2);
		
	}

}
