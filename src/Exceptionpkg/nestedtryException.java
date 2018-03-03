package Exceptionpkg;

public class nestedtryException {
	
	public void nested1()
	{
		try 
		{
		int x= 10; 
		int y= 20;
		int z = x/y;
		int a =5;
		
		try
		{
			 int b=x/a;
			 System.out.println(b);
		}
		 catch(ArithmeticException e)
		{
			 System.out.println("arthimetic exception");
		}
		
		}catch (Exception e)
		{
			System.out.println("error");
		}
		
	}

	public static void main(String[] args) {

		nestedtryException obj = new nestedtryException();
		obj.nested1();
	}

}
