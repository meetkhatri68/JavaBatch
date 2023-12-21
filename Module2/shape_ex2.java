package Module2;

/*
Create a class named 'Shape' with a method to print "This is this is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class,
both having a method to print "This is rectangular shape" and "This is circular shape" respectively. 
Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". 
Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.

*/
class shape
{
	public void shape_print()
	{
		System.out.println("This is a Shape");
	}
}

class rectangle extends shape
{
	public void rectangle_print() 
	{
		System.out.println("This is Rectangle");
	}
}

class Circle extends shape
{
	public void circlr_pirnt() 
	{
		System.out.println("This is Circle");
	}
}

class Square1 extends rectangle
{
	public void Square_print() 
	{
		System.out.println("Square is a Rectangle");
	}
}


public class shape_ex2 
{
	public static void main(String[] args) 
	{
		Square1 obj = new Square1();
		obj.shape_print();
		obj.rectangle_print();
	
	}

}
