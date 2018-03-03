package Javacls;

public class bitwiseoperator {

	public void bitwise()
	{
		int x=60;
		System.out.println(x>>2);
		
	}
	
	public void Leftbitwise()
	{
		int x=80;
		System.out.println(x<<2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bitwiseoperator rightbitwiseope = new bitwiseoperator(); 
		rightbitwiseope.bitwise();
		bitwiseoperator leftbitwise = new bitwiseoperator();
		leftbitwise.Leftbitwise();
	}

}
