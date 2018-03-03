package Javacls;

public class Array1 {
	
	public static void ar1()
	{
		String str[]={"Hi","Hello","done","done1"};
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		
	}
	
	public static void ar2()
	{
		int arr[]={1,2,3,4};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		
		
	}
	public static void main(String[] args)
	{
		
		Array1 arry1 = new Array1(); 
		arry1.ar1();
		Array1 arry2=new Array1();
		arry2.ar2();

	}

}
