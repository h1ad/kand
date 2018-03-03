package Polymarphisam;

public class overloadingcls {
	
	public void disp()
	{
		System.out.println("this is disp");
	}
	public void disp(int x, int y)
	{
		System.out.println("this is int");
		//return ;
	}
	public void disp(int x, String y)
	{
		System.out.println("this is string");
	}
	public void disp(char x, String y)
	{
		System.out.println("this is char");
	}
	
	public static void main(String[] args)
	{
		overloadingcls obj= new overloadingcls();	
		obj.disp();
		obj.disp(10,20);
		obj.disp(10,"D1");
		obj.disp('B',"D2");
	}

}
