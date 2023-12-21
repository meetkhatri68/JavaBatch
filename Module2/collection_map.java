package Module2;

/*Write a Java program to get a collection view of the values contained in this map.*/
s
import java.util.HashMap;

public class collection_map {

	public static void main(String asdf[])
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "red");
		map.put(2, "green");
		map.put(3, "blue");
		
		System.out.println("Values in map - "+ map.values());
	}
}