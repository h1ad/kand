package Interface;

public class in1in2in3 implements interface3{
	
	public void disp()
	{
		System.out.println("h");
	}
	public void disp1()
	{
		System.out.println("h1");
	}
	public void disp3()
	{
		System.out.println("h3");
	}

	public static void main(String[] args) 
	{
		in1in2in3 obj= new in1in2in3();
		obj.disp();
		obj.disp1();
		obj.disp3();
		interface1.disp78();// static method is not override so we are calling method (disp78) by using interface(interface1)
			
	}

}
