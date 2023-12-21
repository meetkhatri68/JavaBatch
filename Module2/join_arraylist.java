package Module2;

import java.util.ArrayList;

/*Write a Java program to join two array lists.*/

public class join_arraylist {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		
		ArrayList<String> colors2 = new ArrayList<String>();
		
		colors2.add("orange");
		colors2.add("violet");
		colors2.add("purple");
		
		System.out.println("Initial - ");
		System.out.println(colors);
		System.out.println(colors2);
		
		colors.addAll(colors2);
		
		System.out.println("Final - "+colors);
	}
}
