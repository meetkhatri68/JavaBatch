package Module2;

/*W.A.J. P to demonstrate try catch block, take two numbers from the user by
Command line argument and perform the division operation and handle Arithmetic*/

import java.util.Scanner;

public class arithmetic2_operation {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int a = s.nextInt();
		
		System.out.println("Enter second number : ");
		int b = s.nextInt();
		
		try
		{
			System.out.println("Answer : "+ (a/b));
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("End Program");
		}
		
		s.close();
	}
}