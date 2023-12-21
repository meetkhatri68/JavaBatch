package Module2;

import java.util.HashSet;

/*Write a Java program to convert a hash set to an array*/

public class convert_hashset {

	public static void main(String asdf[])
	{
		HashSet<String> set = new HashSet<String>();
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		
		System.out.println("HashSet - "+ set);
		
		String arr[] = new String[set.size()];
		
		set.toArray(arr);
		
		System.out.println("Array - "+ arr);
		
		for(int i = 0 ; i < set.size(); i++)
		{
			System.out.println(arr[i]);
		}
	}
}
