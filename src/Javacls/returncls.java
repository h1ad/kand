package Javacls;

public class returncls {
	
	public int disp(int x, int y)
	{
		int z=x+y;
		return z;
	}

	public static void main(String[] args) {
		
		returncls dis=new returncls();
		int b =dis.disp(10, 20); // here passing the b will be store the value of z
		System.out.println(b);
			
	}
	 
}
