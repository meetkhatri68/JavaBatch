package Module2;

import java.util.Scanner;

/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members.*/

class Member
{
	String name,address;
	
	int age,phoneNumber;
	
	double salary;
	
	Member(String name,int age,int phoneNumber,String address,double salary)
	{
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
	}
	
	void printSalary()
	{
		System.out.println("Salary : "+ salary);
	}
}

public class DataMembers {

	public static void main(String asdf[])
	{
		Member m1 = new Member("Ankit",24,9999999,"Rajkot",50000.00);
		
		m1.printSalary();
	}
}
