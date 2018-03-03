package Javacls;

public class nesteforloop {
	
	public void loop1()
	{
		String[] str={"hi","hello"};
		for(String str1:str)
			System.out.println(str1);
	}
	public void loop2()
	{
		String[][] string1={
				{"hi","hello"},
				{"hi2","hello2"}
				};
		for(String[] str2:string1)
			System.out.println(str2);
			{
			
			for(String string3:str2)
				System.out.println(string3);
		}
	}

	public static void main(String[] args)
	{
		nesteforloop loop1 = new nesteforloop();
		loop1.loop1();
	}

}
