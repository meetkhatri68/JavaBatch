package Module2;

/*W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero exception and another one is to handle*/
public class demonstrate_operation 
{

	public static void main(String asdf[])
	{
		try
		{
			int a[] = new int[5];
			
			a[5]= 30/2;
			
			//a[3]=30/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
}
