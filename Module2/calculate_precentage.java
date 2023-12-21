package Module2;

/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects 
(each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. 
The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
Create an object for each of the two classes and print the percentage of marks for both the students.*/

abstract class Marks
{
	abstract double getPercentage();
}

class A extends Marks
{
	double a,b,c;
	
	A(double a, double b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	double getPercentage()
	{
		return (a+b+c)/3.0;
	}
}

class B extends Marks
{
	double a,b,c,d;
	
	B(double a, double b, double c,double d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	double getPercentage()
	{
		return (a+b+c+d)/4.0;
	}
}

public class calculate_precentage {
	public static void main(String asdf[])
	{
		Marks m;
		
		m=new A(80.0,95.0,79.0);
		System.out.println("Percentage of A : "+m.getPercentage());
		
		m=new B(80.0,95.0,79.0,85.0);
		System.out.println("Percentage of B : "+m.getPercentage());
	}
}
