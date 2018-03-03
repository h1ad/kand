package InheritanceConstructor;

public class InheritanceConsChild extends InheritanceConsparent {
	
	InheritanceConsChild() // Default child Constructor
	{
		System.out.println("Default Child Constructor");
	}
	InheritanceConsChild(int x, int y) // parameterized child Constructor
	{
		super(10,30);
		System.out.println("parameterised child Constructor");
	}

	public static void main(String[] args) 
	{
		InheritanceConsChild obj = new InheritanceConsChild(10,20);
		
	}

}
