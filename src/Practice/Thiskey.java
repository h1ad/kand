package Practice;

public class Thiskey {
	
	int x =50;
	
	public void Thiscls()
	{
		int x= 30;
		System.out.println(this.x);
		System.out.println(x);
		
		
	}

	public static void main(String[] args) {
       Thiskey T1 = new Thiskey();
       T1.Thiscls();
	}

}
