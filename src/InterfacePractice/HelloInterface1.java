package InterfacePractice;

public interface HelloInterface1 {
	
	public void m1();
	
	public default void m2()
	{
		System.out.println("This is Default M2");
	}
	public static void m3()
	{
		System.out.println("this is static M3 method");
	}

}
