package InheritanceConstructor;

public class InheritanceConsparent {
	
	
	InheritanceConsparent() // Default parent Constructor
	{
		System.out.println("Default parent Constructor");
	}
	InheritanceConsparent(int x, int y) // parameterized parent Constructor
	{
		this();
		System.out.println("parameterised parent Constructor");
	}
	public static void main(String[] args)
	{

	}

}
