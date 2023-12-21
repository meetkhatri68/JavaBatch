package Module2;

import java.util.ArrayList;

/*Write a Java program to remove the third element from an array list.*/

public class array_list5 {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("cyan");
		
		System.out.println("Before: "+ colors);
		
		colors.remove(3);
		
		System.out.println("After: "+colors);
	}
}