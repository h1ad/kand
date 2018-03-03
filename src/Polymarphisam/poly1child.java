package Polymarphisam;

public class poly1child extends poly1parent{
	public void disp()
	{
		System.out.println("this is Child Disp");
	}

	public static void main(String[] args) {
		poly1parent obj = new poly1child();
		obj.disp(); //this is Child Disp
		
		poly1parent obj1= new poly1parent();
		obj1.disp(); // this is parent Disp 
		obj1=obj;
		obj.disp();
		
		
		//poly1child obj1 = new poly1parent();
		//obj1.disp();// error
		
	  /* poly1child obj3 = new poly1child() ;
	   obj3.disp();
*/		
	}

}
