package Module1;

import java.util.Scanner;

//Write Program use switch statement. Display Monday to Sunday

public class SwitchCase 
{
	public static void main(String[] args) 
	{
		System.out.println("Press 1 For Monday");
		System.out.println("Press 2 For tuesday");
		System.out.println("Press 3 For Wenesday");
		System.out.println("Press 4 For Thursday");
		System.out.println("Press 5 For Friday");
		System.out.println("Press 6 For Saturday");
		System.out.println("Press 7 For Sunday");
		System.out.println("Enter Your Choice: ");
		Scanner sc = new Scanner(System.in);
		int Choice = sc.nextInt();
		switch(Choice)
		{
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wensday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
	    default:System.out.println("Enter Is Worng Choice");
	    break;
		}
	}
}
