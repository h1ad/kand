package Javacls;

public class nestedif {
	
	public void nestedloop(){
		int x= 10;
		int y= 20;
		/*if (x==10)
			System.out.println("x value is ten");
		else 
			System.out.println("x value is not equal ten");*/
		
		if (x==10)
		
		{
			if (y>=55)
				System.out.println("y value is > are = ");
			
		}else
		System.out.println("y value is > are = ");
		
		}

	public static void main(String[] args) {
		
		nestedif nested1 = new nestedif();
		nested1.nestedloop();
	}
	
	
	

}
