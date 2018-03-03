package Javacls;

public class Postincrement {
	
	public void postincre()
	{
		int x = 10 ;
		int y = 20 ;
		
		y= x++ + x++ ;
		System.out.println(y);
		System.out.println(x);
		
		y= x++ + x++ + x++ + x++ ;
		System.out.println(y);
		System.out.println(x);
		
		x= y++ + y++ + y++ ;
		System.out.println(x);
		System.out.println(y);
	
	}	

	public static void main(String[] args) {
		
		Postincrement pincreament = new Postincrement();
		pincreament.postincre(); 	
		
	}

}
