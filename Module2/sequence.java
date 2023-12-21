package Module2;

/*Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters. For
example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).*/

public class sequence 
{
	public void print(char ch,int i)
	{
		System.out.println("Character is: " + ch + " ANd Integer is: " + i);
	}
	
	public void print(int i,char ch)
	{
		System.out.println( "Integer is: " + i +" ANd Character is: " + ch );
	}
	
	public static void main(String[] args) 
	{
		sequence obj = new sequence();
		
		obj.print('T', 5);
		obj.print(8, 'D');
	}
	
}
