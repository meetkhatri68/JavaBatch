package Module2;

import java.util.ArrayList;
import java.util.HashSet;

/*Write a Java program to convert a hash set to a List/Array List.*/

public class converthashset_arraylist {

	public static void main(String asdf[])
	{
		HashSet<String> colors = new HashSet<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		ArrayList<String> colors2 = new ArrayList<String>(colors);
		
		System.out.println("Hashset - "+colors);
		
		System.out.println("ArrayList - "+ colors2);
		
	}
}