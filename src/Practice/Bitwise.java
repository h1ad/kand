package Practice;

public class Bitwise {
	
	public void bitwise()
	{
		int x=80;
		System.out.println(x>>2);
	}

	public void bitwiselaft()
	{
		int x=80;
		System.out.println(x<<2);
	}
	public static void main(String[] args) {
		Bitwise bitwise1 = new Bitwise();
		bitwise1.bitwise();
		Bitwise bitwiseleft=new Bitwise(); 
		bitwiseleft.bitwiselaft();
	}

}
