package Module2;

import java.util.ArrayList;
import java.util.Iterator;

/*Write a Java program to print all the elements of an Array List using the position of the elements.*/

public class array_list12 {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String >();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		Iterator<String> i = colors.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
