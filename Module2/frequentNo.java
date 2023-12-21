package Module2;

//W.A.J.P to find the second most frequent character in a given string. The given string is: successes The second most frequent char in the string is: c

public class frequentNo
{
	public static void main(String[] args) {
		
	
	String s1 = "successes";
	char[] ch = s1.toCharArray();
	
	int ch1 = 0;
	for(int i = 0; i<=7; i++)
	{
		if(ch[i] == ch[i+1])
		{
			ch1++;
		}
		
	}
	System.out.println(ch1);
	}
}
