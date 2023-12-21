package Module2;

import java.util.ArrayList;

/*Write a Java program to iterate through all elements in an array list.*/

public class array_list1 {

	public static void main(String asdf[])
	{
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		for(int i =0; i<colors.size(); i++)
		{
			System.out.println(colors.get(i));
			
		}
	}
}