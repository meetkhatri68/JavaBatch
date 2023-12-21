package Module2;

import java.util.HashMap;

/*Write a Java program to count the number of key-value (size) mappings in a map.*/

public class mapping_hashset {

	public static void main(String asdf[])
	{

		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "red");
		map.put(2, "green");
		map.put(3, "blue");
		
		System.out.println("Size of HashMap : " + map.size());
	}
}
