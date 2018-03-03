package Javacls;

public class constractorcls {
	
	constractorcls()
	{
		System.out.println("this is my first program");
	}
	constractorcls(int x)
	{
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		constractorcls obj = new constractorcls();
		constractorcls obj1 = new constractorcls(10);
	}

}
