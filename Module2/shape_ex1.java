package Module2;

/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize the length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
constructor having a parameter for its side (suppose s) calling the constructor of its
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square*/

class Rectangle
{
	int length,breadth;
	
	Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void printArea()
	{
		System.out.println("Area is : "+(length*breadth));
	}
	
	void printPeri()
	{
		System.out.println("Perimeter is : "+(2*(length+breadth)));
	}
}

class Square extends Rectangle
{

	Square(int side)
	{
		super(side,side);
	}
	
}
public class shape_ex1 {

	public static void main(String asdf[])
	{
		Rectangle r1 = new Rectangle(3,4);
		Square s1 = new Square(5);
		
		System.out.println("RECTANGLE : ");
		r1.printArea();
		r1.printPeri();
		System.out.println("\n\nSQUARE : ");
		s1.printArea();
		s1.printPeri();
	}
}