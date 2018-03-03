package Javacls;

public class Accessmodifier {
	
	public void Publicmethod()
	{
		System.out.println("This is a public Method");
		Privatemethod();		
	}
	private void Privatemethod()
	{
		System.out.println("This is a Private Method");
	}

	protected void protectedmethod()
	{
		System.out.println("This is a Private Method");
	}
	public static void main(String[] args)
	{
		Accessmodifier accessmodifierPublic = new Accessmodifier();
		accessmodifierPublic.Publicmethod();
		Accessmodifier accessmodifierPrivate = new Accessmodifier();
		accessmodifierPrivate.Privatemethod();
		Accessmodifier accessmodifierProtected = new Accessmodifier();
		accessmodifierProtected.protectedmethod();
			
	}

}
