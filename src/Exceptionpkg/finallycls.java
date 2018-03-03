package Exceptionpkg;

public class finallycls {
	
	public void finally1()
	{
		try {
			int x = 10;
			int y = 5;
			int z= x/y;
			
		} /*catch (Exception e) {
			
			System.out.println("error exception");
		}*/
		finally
		{
			System.out.println("this is finally block");
		}
		System.out.println("h1");
		}

	public static void main(String[] args) 
	{
		finallycls obj =new finallycls();
		obj.finally1();
	}

}
