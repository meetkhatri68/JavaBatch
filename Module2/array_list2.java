package Module2;

import java.util.ArrayList;

/*Write a Java program to insert an element into the array list at the first position.*/

public class array_list2 {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("Before: "+ colors);
		
		colors.add(1,"orange");
		
		System.out.println("After: "+colors);
	}
}