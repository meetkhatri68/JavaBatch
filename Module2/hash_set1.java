package Module2;

import java.util.HashSet;

/*Write a Java program to iterate through all elements in a hash list.*/

public class hash_set1 {

	public static void main(String asdf[])
	{
		HashSet<String> colors = new HashSet<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		for( String i : colors)
		{
			System.out.println(i);
		}
	}
}
