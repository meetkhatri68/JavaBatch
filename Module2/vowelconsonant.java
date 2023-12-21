package Module2;

import java.util.Scanner;

//Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel or Consonant, depending on the user input. If the user input
//is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
//message. 

public class vowelconsonant 
{
	public static void main(String[] args) 
	{
		String ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Charater of alphabet: ");
		ch = sc.nextLine();
		if(ch.length() == 1 && ch.matches("a-zA-Z"))
		{
			String c = ch.toUpperCase();
			
			if(ch=="a" && ch=="e" && ch=="i" && ch=="o" && ch=="u")
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
