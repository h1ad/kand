package Javacls;

public class parameters {
	
	int x=20;
	int z=70;
	
	public void disp(int y)
	
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}
  public void disp1(int z)
	
	{
		System.out.println(x);
		System.out.println(z);
		
	}
	public static void main(String[] args) {
		
		parameters obj = new parameters();
				obj.disp(50);
				obj.disp1(90);
				

		}

} 
