package Abstractcls;

public class Abstract1 extends AbstractClass1 
{
	public void disp()
	{
		System.out.println("this is a child");
	}
	public void disp1()
	{
		System.out.println("this is one more child");
	}
	public static void main(String[] args) {
		
		AbstractClass1 obj= new Abstract1();
		obj.disp();
	}

}
