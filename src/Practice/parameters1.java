package Practice;

public class parameters1 {
	
	public void parameter(int x,int y,int z)
	{
		//int x = 10;
		//int z =30 ;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	public static void main(String[] args) 
	{
		parameters1 par123 = new parameters1();
		par123.parameter(20, 30, 10);
		
	}

}