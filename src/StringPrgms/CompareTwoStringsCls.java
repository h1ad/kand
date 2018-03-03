package StringPrgms;

public class CompareTwoStringsCls {
	
	public void Compare1()
	{
		String a = "Bharath";
		String b = "Dharath";
		
		/*if(a.equals(b))
		{
			System.out.println("both Strings are Equal");
		}else 
		{
			System.out.println("both Strings are not Equal");

		}
*/		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("both Strings are Equal");
		}else 
		{
			System.out.println("both Strings are not Equal");

		}

		}

	public static void main(String[] args) {
		
		CompareTwoStringsCls obj= new CompareTwoStringsCls();
		obj.Compare1();

	}

}
