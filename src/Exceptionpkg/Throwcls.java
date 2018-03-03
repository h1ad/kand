package Exceptionpkg;

public class Throwcls {
	
	public void disp(int x)
	{
		if (x>18)
			throw new ArithmeticException("exception");
		else
			System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Throwcls obj =new Throwcls();
		obj.disp(25);

	}
	

}
