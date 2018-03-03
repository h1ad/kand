package Javacls;

public class Forloop {

	public void Forloop1()
	{
		for(int i=0;i++<10;)
			System.out.println(i);
		
	}
	
	/*public void Forloop3()
	{
		for(int i=0;i<10;)
			System.out.println(i);
		
	}*/
	public void Forloop4()
	{
		for(int i=0;i<10;i++)
			System.out.println(i);
		
	}
	
	public static void main(String[] args) {

		Forloop for1 = new Forloop();
		for1.Forloop1();
		//Forloop for2 = new Forloop();
		//for2.Forloop2();
		//Forloop for3 = new Forloop();
		//for3.Forloop3();
		Forloop for4 = new Forloop();
		for4.Forloop4();
		
	}

}
