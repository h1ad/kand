package OOPS;

public class accesspecifiers {
	
	public void accesscifierpublic()
	{
		System.out.println("this is Public");
		//accesscifierprivate();// calling private method in public method
	}
	private void accesscifierprivate()
	{
		System.out.println("this is private");
	}
	protected void accesscifierprotected()
	{
		System.out.println("this is protected");
	}

	public static void main(String[] args) {
		accesspecifiers accesspecifiers1 = new accesspecifiers();
		accesspecifiers1.accesscifierpublic();
		accesspecifiers accesspecifiers2 = new accesspecifiers();
		accesspecifiers2.accesscifierprivate();
		accesspecifiers accesspecifiers3 = new accesspecifiers();
		accesspecifiers3.accesscifierprotected();	
	}

}
