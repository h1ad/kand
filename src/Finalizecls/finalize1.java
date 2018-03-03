package Finalizecls;

public class finalize1 {

	public void finalize() // finalized is a predefined class (class system)
	{
		System.out.println("finalized");
	}
	public static void main(String[] args)
	{
		finalize1 obj = new finalize1();
		obj=null;
		System.gc();
		
		}

}
