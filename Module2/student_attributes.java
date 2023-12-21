package Module2;

import java.io.*;

/*W.A.J.P to create a class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor. 
If age of student is not in between 15 and 21 then generate user defined exception "AgeNotWithinRangeException". 
If name contains numbers or special symbols raise exception "NameNotValidException". Define the two exception classes.*/

class AgeNotWithInRangeException extends Exception
{
	public String toString()
	{
		return("Age is not between 15 and 21 … Please ReEnter the Age");
	}
}
class NameNotValidException extends Exception
{
	public String validname()
	{
		return("Name is not Valid … Please ReEnter the Name");
	}
}
class Student
{
	int roll,age;
	String name,course;
	Student()
	{
		roll=0;
		name=null;
		age=0;
		course=null;
	}
	Student(int r,String n,int a,String c)
	{
		roll=r;
		course=c;
		int l,temp=0;
		l=n.length();
		for(int i=0;i<l;i++)
	{
		char ch;
		ch=n.charAt(i);
		if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
		temp=1;
	}
	/*———-Checking Name——————–*/
	try
	{
		if(temp==1)
		throw new NameNotValidException();
		else
		name=n;
	}
	catch(NameNotValidException e2)
	{
		System.out.println(e2);
	}
	/*———-Checking Age——————–*/
	try
	{
		if(a>=15 && a<=21)
		age=a;
		else
		throw new AgeNotWithInRangeException();
	}
		catch(AgeNotWithInRangeException e1)
	{
			System.out.println(e1);
	}
	}
	void display()
	{
		System.out.println("————————————————");
		System.out.println("|roll Name Age Course|");
		System.out.println("|"+roll+" "+name+" "+age+" "+course+"|");
		System.out.println("————————————————");
	
	}
}


public class student_attributes
{
	public static void main(String args[])throws IOException
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int r,a;
		String n,c;
		
		System.out.println("Enter roll,name,age,course");
		
		r=Integer.parseInt(br.readLine());
		n=br.readLine();
		a=Integer.parseInt(br.readLine());
		c=br.readLine();
		Student s=new Student(r,n,a,c);
		s.display();
	}
}