package Exceptionpkg;

public class NullpointExceptioncls1 {
	
	public void disp()
	{
		try {
			System.out.println("Hi");
		} 
		catch (NullPointerException e) 
		{

			System.out.println("error in nullpoint");
		}
		
	}

	public static void main(String[] args) {
		NullpointExceptioncls1 obj = new NullpointExceptioncls1(); 
		try
		{
			obj= null;
			obj.disp();
		}
		
		catch (NullPointerException e)
		{
			System.out.println("error");
		}
		
	}

}
