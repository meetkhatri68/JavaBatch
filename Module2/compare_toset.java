package Module2;

import java.util.ArrayList;

/*Write a Java program to compare two sets and retain elements which are same on both sets.*/

public class compare_toset {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String >();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		ArrayList<String> colors2 = new ArrayList<String >();
		
		colors2.add("orange");
		colors2.add("green");
		colors2.add("blue");
		
		System.out.println("Colors - "+colors);
		System.out.println("Colors2 - "+colors2);
		
		colors.retainAll(colors2);
		
		
		System.out.println("Common Elements : "+ colors);
	}
}
