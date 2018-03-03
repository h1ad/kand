package Javacls;

public class booleandatatypecls {
	
	public void boolean1()
	{
	boolean a = true;
	boolean a1=  false;
	
	if(a==true)
		System.out.println("true");
	else
		System.out.println("false");
		
	}
	public void boolean2()
	{
		boolean a = true;
		boolean a1=  false;
		
		if(a)
			System.out.println("true");
		else
			System.out.println("false");
		
	}
	 public void boolean3()
	 {
		 boolean a = true;
			boolean a1=  false;
			
			if(a==false)
				System.out.println("true");
			else
				System.out.println("false");
		 
	 }
	 public void boolean4()
	 {
		 boolean a = true;
			boolean a1=  false;
			
			if(!a)
				System.out.println("true");
			else
				System.out.println("false");
		 
	 }
	 
	 public void boolean5()
	 {
		 boolean a = true;
			boolean a1=  false;
			
			String str = (a)? "hi":"hello";
			
				System.out.println(str);		 
	 }
	 
	 public void boolean6()
	 {
		 boolean a = true;
			boolean b=  false;
			String str=(!b)? "true":"false";

	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		booleandatatypecls booleandatatypecls1 = new booleandatatypecls();
		booleandatatypecls1.boolean1();
		booleandatatypecls booleandatatypecls2 = new booleandatatypecls();
		booleandatatypecls2.boolean2();
		booleandatatypecls booleandatatypecls3 = new booleandatatypecls();
		booleandatatypecls3.boolean3();
		booleandatatypecls booleandatatypecls4 = new booleandatatypecls();
		booleandatatypecls4.boolean4();
		booleandatatypecls booleandatatypecls5 = new booleandatatypecls();
		booleandatatypecls5.boolean5();
		booleandatatypecls booleandatatypecls6 = new booleandatatypecls();
		booleandatatypecls6.boolean6();

		
		
		
	}

}
