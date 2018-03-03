package Exceptionpkg;

public class ArrayIndexcls {
	
	public void arrayIndex123()
	{
		try {
			String[] str = {"hi","hello"};
			System.out.println(str[2]);
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Error in ArrrayIndex");
					}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayIndexcls obj =new ArrayIndexcls();
		obj.arrayIndex123();
	}

}
