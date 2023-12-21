package Module2;

import java.util.ArrayList;

/*Write a Java program to extract a portion of an array list.*/

public class array_list10 {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("Before : "+colors);
		
		System.out.println("Sublist : "+ colors.subList(1,3));
	}
}
