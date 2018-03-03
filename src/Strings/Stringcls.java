package Strings;

public class Stringcls {
	
	public void String1()
	{
		String str ="bharath";
	    String str1 = "r";
		int len = str.length();
		System.out.println(len);
		
		char str11=str.charAt(2);
		System.out.println(str11);
		System.out.println(str.substring(2));
		boolean b =str.endsWith("h");
		System.out.println(b);
		System.out.println(str.endsWith("h"));
		
		System.out.println(str.indexOf('t'));
		
		System.out.println(str.trim());
		System.out.println("compare " +str.compareTo("bharath"));
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf("r",0));

		
	}

	public static void main(String[] args) 
	{

		Stringcls obj = new Stringcls();
		obj.String1();
				
	}

}
