package Module2;

import java.util.HashSet;

/*Write a Java program to get the number of elements in a hash set.*/

public class hash_set2 {

	public static void main(String asdf[])
	{
		HashSet<String> colors = new HashSet<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		System.out.println("Size of HashSet : "+ colors.size());
	}
}
