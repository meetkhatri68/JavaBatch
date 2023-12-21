package Module2;

//Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.

public class method 
{
	public void input(char ch , int i)
	{
		System.out.println("Character is "+ ch + " integer is "+i);
	}
	public void input(int i , char ch)
	{
		System.out.println("integer is "+ i + " Character is "+ch);
	}
	public static void main(String[] args) 
	{
		method obj = new method();
		
		obj.input('l', 9);
		obj.input(6, 'p');
	}
	
}
