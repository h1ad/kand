package OOPS;

public class Constructor1 {

	Constructor1()
	{
		
		System.out.println("con1");
	}
	Constructor1(int x)
	{
		this(10,"Hi");
		System.out.println("con2");
		
	}
	Constructor1(int x,String i)
	{
		this();// * we can use this with in constractor
		System.out.println("con3");
	}

	public static void main(String[] args) {
		 Constructor1 obj = new Constructor1(10);
		 
		
	}
	
	

}
