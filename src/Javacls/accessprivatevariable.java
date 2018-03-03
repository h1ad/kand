package Javacls;

public class accessprivatevariable {

	private int x;
	public void set(int x)
	{
		this.x=x;
	}
	public int get()
	{
		return x;
	}
	public static void main(String[] args) 
	{
		accessprivatevariable obj = new accessprivatevariable();
		obj.set(10);
		int a= obj.get();
		System.out.println(a);

	}

}
