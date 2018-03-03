package Exceptionpkg;

public class multipulcatches {
	
	public void mul()
	{
		try {
			int x= 10;
			int y=0;
			int z= x/y;
		} 
		catch (ArithmeticException e) 
		{
		System.out.println("Arrthimaitic Exception error");	
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Error in ArrrayIndex");
		}
		catch (NullPointerException e) {
			
			System.out.println("nullpoint Exception error");
		}
	}

	public static void main(String[] args) {

		multipulcatches mul1= new multipulcatches();
		mul1.mul();
		
	}

}
