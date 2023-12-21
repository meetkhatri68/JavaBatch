package Module2;

//W.A.J.P to get the character at the given index within the String. Original String = Tops Technologies! 
//The character at position 0 is T, The character at position 10 is o

public class index_string 
{
	public static void main(String[] args) 
	{
		String st = "Tops Tecnologies";
		System.out.println("String "+ st);
		
		int index1 = st.charAt(0);
		int index2 = st.charAt(10);
		System.out.println("The Character position 0: "+(char)index1);
		System.out.println("The Character position 10: "+(char)index2);
	}
}
