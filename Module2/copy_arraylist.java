package Module2;

import java.util.ArrayList;

/*Write a Java program to copy one array list into another.*/

public class copy_arraylist {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("colors: "+ colors);
		
		ArrayList<String> colors2 = new ArrayList<String>(colors);
		
		System.out.println("colors2 : "+colors2);
	}
}
