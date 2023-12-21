package Module2;

/*Write a Java program to sort a given array list.*/

import java.util.ArrayList;
import java.util.Collections;

/*Write a Java program to sort a given array list.*/

public class array_list7 {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("Before: "+ colors);
		
		Collections.sort(colors);
		
		System.out.println("After: "+colors);
	}
}
