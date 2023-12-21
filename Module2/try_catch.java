package Module2;

/*W.A.J. P to demonstrate try catch block,*/

public class try_catch {

	public static void main(String asdf[])
	{
		try
		{
			int data = 10/0;
			System.out.println(data);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		finally 
		{
			System.out.println("success");
		}
	}
}