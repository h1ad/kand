package NestedCls;

public class Nestedcls1 {
	
	static int a=10;
	
	static class Nested_Demo
	{
		static int x =10;
		int z = 10;
		static String str = "hello";
		
		public static void my_method()
		{
			System.out.println("This is my nested class");
		}
		
	}

	public static void main(String args[]) 
	{
		Nestedcls1.Nested_Demo nested = new Nestedcls1.Nested_Demo();
		nested.my_method();
		
		nested.x=200;
		System.out.println(Nestedcls1.Nested_Demo.x);
		
	}
}


