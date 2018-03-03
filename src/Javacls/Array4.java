package Javacls;

public class Array4 {
	
	public void arr2()
	{
		String[][][] str= {
							{ 
								{"hi","hello"},
		
							  {"hi1","hello1"}
							} ,
							{
								{"hi","hello"},
								{"hi2","hello2"}
							}
		};
	System.out.println(str[1][0][0]);
	System.out.println(str[0][1][0]);
	System.out.println(str[1][0][1]);
	System.out.println(str[1][1][0]);
		
		
	}

	public static void main(String[] args)
	{

		Array4 ar7 = new Array4();
		ar7.arr2();
	}

}
