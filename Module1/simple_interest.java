package Module1;
//Write a program to find the simple Interest

import java.util.Scanner;

public class simple_interest 
{
	public static void main(String[] args) 
	{
		float SI;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal Amount = ");
		float P = sc.nextFloat();
		System.out.println("Enter The Rate of Amount = ");
		float R = sc.nextFloat();
		System.out.println("Enter the Time = ");
		float T = sc.nextFloat();
		SI = (P * R * T)/100;
		System.out.println("Simple Interest = "+SI);
	}
}
