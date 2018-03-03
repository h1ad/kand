package OOPS;

public class Constructor {
	
	Constructor()
	{
		System.out.println("this is constructor");
	}
	Constructor(int x,int y)
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) 
	{
				//Constructor constructor1 = new Constructor(); 
				Constructor constructor2 = new Constructor(10,20);
	}

}
