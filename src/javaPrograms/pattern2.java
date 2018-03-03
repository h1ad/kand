package javaPrograms;

public class pattern2 {
	
	public void m1()
	{
		for (int i = 1; i <= 5; i++) 
			
			{
			
            for (int j = 1; j <= i; j++) 
            
            {
                System.out.print("*");
            }
 
            System.out.println();
        }
		
		System.out.println("---------------------------------");
    }	
	
	public void m2()
	{
		for (int i = 1; i <= 5; i++) 
			
			{
			
            for (int j = i; j <= 5; j++) 
            
            {
                System.out.print("*");
            }
 
            System.out.println();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pattern2 p2 = new pattern2();
          p2.m1();
          p2.m2();

	}

}
