package OOPS;

public class childclass2 extends parentclass2 {
	
	childclass2()
	{
		System.out.println("Child Default constructor");
	}
	childclass2(int y)
	{
		super(20);
		System.out.println("Child Parameter Constructor");
	}

	public static void main(String[] args) 
	{
		childclass2 obj = new childclass2(10);
		
	}

}
