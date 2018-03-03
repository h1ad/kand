package OOPS;

public class accessprivatevariables {

	private int x;
	private int y;
	
	public void set(int x,int y)
	{
	  this.x=x;
	  this.y=y;
	}
	public int get()
	{
		return x;
		
	}
	public int get1()
	{
		return y;
		
	}
	
	public static void main(String[] args) 
	{
		accessprivatevariables a1 = new accessprivatevariables();
		a1.set(10,20);
		int a=a1.get();
		int b=a1.get1();
		System.out.println(a);
		System.out.println(b);
		
	}

}
