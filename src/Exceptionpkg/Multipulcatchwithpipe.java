package Exceptionpkg;

public class Multipulcatchwithpipe {
	
	public void mul123()
	{
		try {
			int x= 10;
			int y=0;
			int z= x/y;
		} 
		catch (ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException|NumberFormatException  e) 
		{
		System.out.println("Arrthimaitic Exception error");	
		}
	}

	public static void main(String[] args) {

		Multipulcatchwithpipe obj = new Multipulcatchwithpipe();
		obj.mul123();
	}

}
          