package InheritanceConstructor1;

public class InhertenceConChild1 extends InhertenceConParent1{
	
	/*InhertenceConChild1()
	{
		System.out.println("Child default Constructor");
	}
*/	InhertenceConChild1(int x, int y)
	{
		super(x,y);
		System.out.println("Child Parameterized Constructor");
	}
	public static void main(String[] args) {
		
		InhertenceConChild1 obj = new InhertenceConChild1(10,20);

	}

}
