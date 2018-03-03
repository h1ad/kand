package Interface;

public class cb1 implements bhainterface {
	
	public void disp()
	{
		System.out.println("this is interface");
	}
	public void disp1()
	{
		System.out.println("this is interface");
	}
	
	public static void main(String[] args) 
	{
		bhainterface obj = new cb1();
		obj.disp();
		 
	}

}
