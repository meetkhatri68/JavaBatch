package Module2;

import java.util.Scanner;

//Write a Java program to count the letters, spaces, numbers and other characters of an input string. 

public class inputstring 
{
	public static void main(String[] args) 
	{
		char[] ch;
		String c;
		int letter=0,space=0,num=0,other=0,length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data");
		c = sc.nextLine();
		ch = c.toCharArray();
		length = c.length();
		for(int i=0;i<length;i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else
			{
				other++;
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("Letter  "+letter);
		System.out.println("Number  "+num);
		System.out.println("Space  "+space);
		System.out.println("Other  "+other);
	}
}
