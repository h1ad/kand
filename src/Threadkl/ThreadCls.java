package Threadkl;

public class ThreadCls extends Thread {
	
	public void run()
	{
		
		System.out.println("this is Thread");
		
		
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i);
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ThreadCls obj = new ThreadCls();
		ThreadCls obj1=new ThreadCls();
		ThreadCls obj2=new ThreadCls();
		obj.start();
		obj.join();
		obj1.start();
		obj2.start();
	//	obj.join(5000);

		
		
		
		
				

	}

}
