package Module2;

/*Create a class with a method that prints "This is a parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of
the class and call 1 - method of parent class by object of parent class 2 - method of
child class by object of child class 3 - method of parent class by object of child class*/

class parent
{
	public void parentmethod() 
	{
		System.out.println("This Is Parent Class");
	}
}

class child extends parent
{
	public void childmethod() 
	{
		System.out.println("This Is Child Class");
	}
}

public class inheritance 
{
	public static void main(String[] args) 
	{
		child c = new child();
		c.parentmethod();
		c.childmethod();
	}
}
