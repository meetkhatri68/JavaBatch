package Module2;

import java.util.ArrayList;
import java.util.Collections;

/*Write a Java program to shuffle elements in an array list.*/

public class array_list8 {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("Before: "+ colors);
		
		Collections.shuffle(colors);
		
		System.out.println("After: "+colors);
	}
}
