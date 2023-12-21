package Module2;

import java.util.ArrayList;

/*Write a Java program to increase the size of an array list.*/

public class sizeof_arraylist {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String >();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("Size of ArrayList : "+ colors.size());
		
		colors.ensureCapacity(10);
		
		System.out.println("Capacity increased to 10");

		
	}
}
