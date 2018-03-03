package Exceptionpkg;

public class NumberFormetExceptioncls {
	public void NumberFormet()
	{
		try {
			String str="hello1";
			int i=Integer.parseInt(str);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("exception");
		}
	}

	public static void main(String[] args) {
		NumberFormetExceptioncls obj = new NumberFormetExceptioncls();
		obj.NumberFormet();
		
		
	}

}
//each try can have more catch blocks 
