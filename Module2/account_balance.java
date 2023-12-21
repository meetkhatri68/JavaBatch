package Module2;

import java.rmi.UnexpectedException;

/*W.A.J.P to create a custom exception if Customer withdraw amount which is greater than account balance then program will 
show custom exception otherwise amount
will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 2500*/

public class account_balance {

	static void withdraw(int balance, int amt) throws Exception
	{
		if(amt<=balance)
		{
			System.out.println("Withdraw Successful. Balance : "+ (balance-amt));
		}
		else
		{
			System.out.println("Insufficient Balance . Need "+(amt-balance)+" to perform action.");
			throw new Exception("Insufficient balance error.");
		}
	}
	
	public static void main(String asdf[])
	{
		try
		{
			withdraw(2000,2500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}