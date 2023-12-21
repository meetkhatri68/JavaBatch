package Module2;

/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' 
without any parameter in its constructor*/

class triangle
{
	void  triangle1() 
	{
		
		float a = 3;
		float b = 4;
		float c = 5;
		
		float s = ((a + b + c)/2);
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Semi perimeter is: " + s);
		System.out.println("area of triangle is: " + area);
		
	}
}
public class areaoftriangle 
{
	
	public static void main(String[] args) 
	{
		triangle T = new triangle();
		T.triangle1();
	
	}
}