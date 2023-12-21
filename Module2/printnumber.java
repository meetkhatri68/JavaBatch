package Module2;

//Create a class named 'Print Number' to print various numbers of different data types
//by creating different methods with the same name 'printn' having a parameter for
//each data type.
public class printnumber 
{
	public void printno(int no) 
	{
		System.out.println(no);
	}
	public void printno(float no) 
	{
		System.out.println(no);
	}
	public void printno(double no) 
	{
		System.out.println(no);
	}
	public void printno(long no) 
	{
		System.out.println(no);
	}
	
	public static void main(String[] args)
	{
		printnumber obj = new printnumber();
		obj.printno(11);
		obj.printno(10.10f);
		obj.printno(12.12);
		obj.printno(2222222L);
	}
}
