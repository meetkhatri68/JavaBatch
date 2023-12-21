package Module2;

import java.util.Scanner;

/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' 
with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' 
taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' 
is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' 
and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods. 
I3. Write a program which will ask the user to enter his/her marks (out of 100).*/

abstract class Shape3
{
	public abstract void RectangleArea(double length,double breadth);
	public abstract void SquareArea(double side);
    public abstract void CircleArea(double radius);
}
class Area extends Shape3
{
	public void  RectangleArea(double length,double breadth)
	{
		System.out.println("Rectangle Area = " + (length * breadth));
	}
	
	public void CircleArea(double radius) 
	{
		System.out.println("Area Of Circle = " + 3.14* radius*radius);
	};
	
	public void SquareArea(double side) 
	{
		System.out.println("Area Of Squar= " + side*side);
	};
}

public class abstract_area
{
	public static void main(String[] args) {
		
	
	
		Area obj = new Area();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer length for rectangle: ");
	    double len = sc.nextDouble();
	    System.out.print("Entrer breadth for rectangle: ");
	    double bre = sc.nextDouble();
	    obj.RectangleArea(len, bre);
		
	    

        System.out.print("Entrer Radius for circle: ");
        double rad = sc.nextDouble();
        obj.CircleArea(rad);
        
        System.out.print("Entrer Length for square: ");
        double sid = sc.nextDouble();
        obj.SquareArea(sid);
	}
}