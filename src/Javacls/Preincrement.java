package Javacls;

public class Preincrement {
	
	public void pre()
	{
		int x = 4 ;
		int y = 8 ;
		y = ++x;
		System.out.println(y);// y= 5 , x= 5
		System.out.println(x);
		
		x= x++ + ++ x; //x=11
		System.out.println(x);	//x=12 , y= 5
		System.out.println(y);  //
		
	}

	public static void main(String[] args) {
		Preincrement pre1 = new Preincrement();
		pre1.pre();
		
		
		
	}

}
