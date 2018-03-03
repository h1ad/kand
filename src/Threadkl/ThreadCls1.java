package Threadkl;

public class ThreadCls1 extends Thread{
	
	public void run()
	{
	System.out.println("hi");	
	}

	public static void main(String[] args) {
		ThreadCls1 obj = new ThreadCls1();
		ThreadCls1 obj1 = new ThreadCls1();
		
		System.out.println(obj.getId());
		System.out.println(obj1.getId());
		System.out.println(obj.getName());
		System.out.println(obj1.getName());
		
		obj.setName("my Thread1000");
        obj1.setName("my Thread12345");
		
	}

}
