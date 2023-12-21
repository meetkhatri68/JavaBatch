package Module2;

/*W.A.J.P to create the validate method that takes integer value as a parameter. If the age is less than 18, 
then throw an Arithmetic Exception otherwise print a message welcome to vote.
*/
public class validate_method {

	static void validate(int age) throws ArithmeticException
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new ArithmeticException("Age not valid");
		}
			
	}
	
	public static void main(String asdf[])
	{
		try
		{
			validate(21);
			validate(15);			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("End Program");
		}
	}
}
