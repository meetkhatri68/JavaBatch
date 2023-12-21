package Module2;

/*W.A.J.P to start the same Thread twice by calling start () method twice. Test ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();*/

class A11 extends Thread
{
	@Override
	public void run() {
		//super.run();
		for(int i=1;i<=10;i++)
		{
			System.out.println("A1 : "+i);
		}
		
	}
}

public class Thread_twice 
{

	public static void main(String asdf[])
	{
		A11 a = new A11();
		A11 a1 = new A11();
		
		a.start();
		a1.start();
	}
}