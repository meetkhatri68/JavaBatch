package Module2;

import java.util.ArrayList;
import java.util.Scanner;

/*Write a Java program to search an element in an array list.*/

public class array_list6 {

	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println(colors);
		
		System.out.println("Enter element to search : ");
		
		String temp = s.next();
		
		System.out.println(colors.indexOf(temp));
		
		s.close();
	}
}