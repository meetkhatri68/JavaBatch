package Module2;

/*W.A.J.P to find all interleaving of given strings.
The given strings are: WX YZ
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ*/

import java.util.HashSet;
import java.util.Set;

public class Interleaving_String 
{
	
	public static void allInterleavings(String res, String A, String B, Set out) {
        
        if (A.length() == 0 && B.length() == 0) {
            out.add(res);
            return;
        }
        
        if (A.length() > 0) {
            allInterleavings(res + A.charAt(0), A.substring(1), B, out);
        }
        
        if (B.length() > 0) {
            allInterleavings(res + B.charAt(0), A, B.substring(1), out);
        }
    }
	
	public static void main(String[] args) 
	{
		String A = "WX";
		String B = "YZ";
		
		System.out.println("Given String Are: " + A + "  " + B);
		Set<String> interleaving = new HashSet<String>();
		
		allInterleavings("", A, B, interleaving);
		interleaving.stream().forEach(System.out::println);
		
	}
}
