package Module2;

//W.A.J.P to check whether a given string ends with the contents of another string.
//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True
		
public class contentstring 
{
	public static void main(String[] args) 
	{
		String s = "Java Exercises";
		String s1 = "Java Exercise";
		
		System.out.println(s.startsWith("se"));
		System.out.println(s1.endsWith("se"));
	}
}
