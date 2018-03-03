package OOPS;

public class superclsChild extends superclsparent {
	
	public void disp()
	{
		System.out.println("this is Child Disp");
		super.disp();
	}

	public static void main(String[] args) {
		superclsChild obj = new superclsChild();
		obj.disp();
		
	}

}
