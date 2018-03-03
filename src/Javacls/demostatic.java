package Javacls;

public class demostatic {
	
	int x= 30; 
	static int y= 40;
	
	public static void disp()
	{
		int z = 10;
		//static int y= 40;//cannot declare static variable inside any method 
		System.out.println(y);
		
	}
	
	public static void main(String[] args) {
	//System.out.println(x);// Can not print the non static variables in static methods   	 		
	 System.out.println();
		
	}

}
