package Module2;

//Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. 
//The method for printing area of a rectangle has two parameters which are length and breadth respectively 
//while the other method for printing area  of square has one parameter which is side of square.
class area
{
	static int area(int length,int breadth)
	{
		return length * breadth;
	}
	static int area(int length)
	{
		return length * length;
	}
	
}
public class printarea extends area
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 5;
		System.out.println("Area Of Rectangle Is "+ area(a,b));
		System.out.println("Area Of Square Is "+ area(a));
		
	}
}
