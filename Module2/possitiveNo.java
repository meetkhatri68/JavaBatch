package Module2;

import java.util.Scanner;

//• Write a Java program that reads a positive integer and count the number of digits the number.
 
public class possitiveNo 
{

	public static void main(String[] args) 
	{
	
		{
			System.out.println("Enter The Number: ");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();

			//declare a variable to count number of digits
			int digit = 0;
			while(number != 0)
			{
				//pick last digit of the number and count one by one
				int pick_last = number % 10;
				digit++;
				number = number / 10;
			}

			//display number of digits
			System.out.print("Number of Digits = "+digit);

		}
	}
}
