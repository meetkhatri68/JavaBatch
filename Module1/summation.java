package Module1;

import java.util.Scanner;

// Write a program you have to make a summation of first and last Digit.
//(E.g. 1234 ans:-5)

public class summation 
{
	public static void main(String[] args) 
	{
		int No,First,Last;
		int sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		No = sc.nextInt();
		Last=No % 10;
		while(No > 10)
		{
			No= No/10;
		}
		First = No;
		sum=First+Last;
		System.out.println("Summation of First And Last Digit is : "+sum);
	}
}
