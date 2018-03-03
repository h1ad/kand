package Javacls;

public class staticcls {
	int x= 20;
	static int y= 30;
	static int z = 10; 

	public static void main(String[] args) {
		
		staticcls obj = new staticcls();
		System.out.println(obj.x);
		
		staticcls obj1=new staticcls();
		System.out.println(obj1.x);
		obj.y=50;

	//	System.out.println();
		System.out.println(obj1.y);
		
	}

}
