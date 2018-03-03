package Javacls;

public class This {
	
	int x= 10;
	
	public void display()
	{
		int y= 20;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(x);
		
	}

	public static void main(String[] args) {
		This obj = new This();
		obj.display();
		obj.x=30;
		obj.display();
			
		
	}

}
