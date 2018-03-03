package InnerCls;

public class innedcls1 {
	
	
	public void m1()
	{
		System.out.println("This is M1");
	}
	
	
	class innedcls2 {// second class
		
		
		public void m2()
		{
			System.out.println("This is M2");
		}
	}
	public static void main(String[] args) {
		
		innedcls1 a1 = new innedcls1();
		innedcls1.innedcls2 a2 = a1.new innedcls2();
		a2.m2();
		a1.m1();

	}

}

