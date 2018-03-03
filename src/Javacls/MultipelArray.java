package Javacls;

public class MultipelArray {
	
	public void multipul1()
	{
		String[][] str={{"hi","hello"},{"hi1","hello"}};
		System.out.println(str[0][1]);
		System.out.println(str[1][0]);
		System.out.println(str[1][1]);
		System.out.println(str[0][0]);
		
	}

	public static void main(String[] args)
	{

		MultipelArray mularray1 = new MultipelArray();
		mularray1.multipul1();
	}

}
