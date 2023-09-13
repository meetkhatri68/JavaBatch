package Module1;

import java.util.Scanner;

//Write a program make a summation of given number(E.g. 1523 ans :-11)

public class Summation2 
{
	public static void main(String[] args) 
	{
		int No,R;
		int Sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		No = sc.nextInt();
		while(No > 0)
		{
			R=No%10;
			Sum=Sum+R;
			No=No/10;		
		}
		System.out.println("Sum Of All Number Is: "+Sum);
	}	
}
