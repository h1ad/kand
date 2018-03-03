package Threadkl;

public class ThreadCls2 extends Thread{
	
	public void run()
	{
		System.out.println("this is Thread");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}

	}

	public static void main(String[] args) 
	{
		ThreadCls2 obj  = new ThreadCls2();
		obj.setDaemon(true);
		obj.start();
		
	}

}
