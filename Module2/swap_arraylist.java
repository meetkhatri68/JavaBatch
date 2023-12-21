package Module2;

import java.util.ArrayList;
import java.util.Collections;

/*Write a Java program of swap two elements in an array list.*/

public class swap_arraylist {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("before : "+ colors);
		
		Collections.swap(colors, 0, 2);
		
		System.out.println("After : "+ colors);
	}
}
