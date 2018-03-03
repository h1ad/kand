package Interface;

public interface interface1 {
	
	
	public void disp();
	
	public default void disp45()
	{  
		System.out.println("h1");
	}
	public static void disp78() //static method can not override
	{
		System.out.println("1234");
	}


}

/*after release the project we want to add one more method-
-in a interface (not possible to add interface then we have to write the default in method ) 
then we will use below method with default it will reflect in classes. 

public default void disp45()
{  
	System.out.println("h1");
}
*/