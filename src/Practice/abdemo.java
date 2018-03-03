package Practice;

public class abdemo 
{

	 public static void main(String[] args)
	
	{
		 Maheshphone obj = new sureshphone();
		 obj.call();
		 obj.cook();
		 obj.dance();
		 obj.move();
		 
	}

}

 abstract class Maheshphone
{

	public void call()
	{
		System.out.println("calling....");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
	
}
 
 abstract class rameshphone extends Maheshphone
 {
	 public void move()
	 {
		 System.out.println("moving....");
	 }
	    public abstract void dance();
		public abstract void cook();
 }
  class sureshphone extends rameshphone
  {
	  public void dance()
	  {
		 System.out.println("dance"); 
	  }
	  public void cook()
	  {
		 System.out.println("Cook"); 
	  }
  }
 
 
 
 
 
 
 
 
 
 

