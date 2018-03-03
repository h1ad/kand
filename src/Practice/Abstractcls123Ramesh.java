package Practice;

public abstract class Abstractcls123Ramesh 

{
	public void Calling()
	{
		System.out.println("Calling....");
	}
	abstract public void Move();
	abstract public void Dance();
	abstract public void shaking();
	 
	public static void main(String[] args)
	{
		Abstractcls123Ramesh obj = new munna();
		obj.Calling();
		obj.Dance();
		obj.Move();
		obj.shaking();
	}
	
	abstract class Bittu extends Abstractcls123Ramesh
	{
		 public void Move()
		 {
				System.out.println("Moving....");
		 }
		 	abstract public void Dance();
			abstract public void shaking();

	}
	
	class munna extends Bittu
	{
		 public void Dance()
		 {
			System.out.println("Dance...."); 
		 }
		 public void shaking()
		 {
			System.out.println("Shacking..."); 
		 }
	}

}
