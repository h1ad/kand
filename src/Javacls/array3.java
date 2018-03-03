package Javacls;

public class array3 {
	
	public void arr3()
	{
		String[][] str = new String[2][3];

		str[0][1]="hello";
		System.out.println(str[0][1]);
	}

	public static void main(String[] args)
	{
		array3 Arr = new array3();
		Arr.arr3();
	}

}
