package Threadkl;

class Customernewdemo{
	
	synchronized void withdraw() throws InterruptedException
	{
		System.out.println("going to withdraw ...");
		
		wait();
		
		System.out.println("withdraw completed");
	}
	synchronized void deposit()
	{
		System.out.println("going to deposit..");
		
		notify();
	}
	
}
public class Threadwaitnotifyclsdemo {

	public static void main(String[] args) 
	
	{
		Customernewdemo cust = new Customernewdemo(); 
		Thread t1 = new Thread()
		{
			public void run()
			{
				try {
					cust.withdraw();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			};
		t1.start();
		Thread t2 = new Thread(){
		public void run()
		{
			cust.deposit();
		}
		};
		t2.start();
	}

}
