package Practice;

public class AccessSpecifiersInMethods {
	
	public void accessspecifierpublic()
	{
		System.out.println("Public");
		accessspecifierprivate();
	}
	private void accessspecifierprivate()
	{
		System.out.println("Private");
	}
	protected void accessspecifierprotected()
	{
		System.out.println("protected");
	}

	public static void main(String[] args) {
		AccessSpecifiersInMethods obj = new AccessSpecifiersInMethods();
		obj.accessspecifierpublic();//public
		obj.accessspecifierprivate();//error
		obj.accessspecifierprotected();//protected
	}

}
