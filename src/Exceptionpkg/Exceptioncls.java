package Exceptionpkg;

import Javacls.Arithmatic;

public class Exceptioncls {
	
	public void arithamaticMethd()
	{
		try {
			int x =10;
			int y=0;
			System.out.println("hello");
			int z=x/y;//program terminate in this point then catch the error 
			System.out.println(z);
			System.out.println("hello");
		} 
		catch (ArithmeticException e) 
		{
		System.out.println("Arrthimaitic Exception error");	
		}
	}
	

	public static void main(String[] args) {
		Exceptioncls obj = new Exceptioncls();
		obj.arithamaticMethd();
		
	}

}
