package Module2;

/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
having a method with the same name 'message' that prints "This is first subclass"
and "This is second subclass" respectively. Call the methods 'message' by creating
an object for each subclass*/
abstract class Parent 
{
	    abstract void message();
}

class FirstSubclass extends Parent 
{
	  void message() 
	  {
	        System.out.println("This is first subclass");
	  }
}

class SecondSubclass extends Parent 
{
	    void message() 
	    {
	        System.out.println("This is second subclass");
	    }
}

public class abstract_class
{
	    public static void main(String[] args) 
	    {
	        FirstSubclass firstSubclass = new FirstSubclass();
	        SecondSubclass secondSubclass = new SecondSubclass();

	        firstSubclass.message();
	        secondSubclass.message();
	    }
}

