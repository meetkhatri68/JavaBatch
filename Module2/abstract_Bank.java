package Module2;

/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.
*/
abstract class BANK
{
	abstract int getbalance();
}

class bankA extends BANK
{
	private int balance = 500;
	void deposite(int money)
	{
		balance += money;
	}
	@Override
	int getbalance() {
		// TODO Auto-generated method stub
		return balance;
	}
}

class bankB extends BANK
{
	private int balance=500;
	void deposite(int money)
	{
		balance += money;
	}
	@Override
	int getbalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
}

class bankC extends BANK
{
	private int balance=500;
	void deposite(int money)
	{
		balance += money;
	}
	@Override
	int getbalance() {
		// TODO Auto-generated method stub
		return balance;
	}
}

public class abstract_Bank 
{
	public static void main(String[] args) 
	{
		bankA b1 = new bankA();
		bankB b2 = new bankB();
		bankC b3 = new bankC();
		
		b1.deposite(100);
		b2.deposite(150);
		b3.deposite(200);
		
		System.out.println("Balance of bankA = " + b1.getbalance());
		System.out.println("Balance of bankB = " + b2.getbalance());
		System.out.println("Balance of bankC = " + b3.getbalance());
	}

}