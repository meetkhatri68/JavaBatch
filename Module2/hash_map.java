package Module2;

import java.util.HashMap;

/*Write a Java program to associate the specified value with the specified key in a Hash Map.*/

public class hash_map {

	public static void main(String asdf[])
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "red");
		map.put(2, "green");
		map.put(3, "blue");
		
		System.out.println(map);
		
	}
}