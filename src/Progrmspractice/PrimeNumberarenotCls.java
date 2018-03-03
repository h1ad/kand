package Progrmspractice;

public class PrimeNumberarenotCls {
	
	public void PrimeNrNot()
	{
		int num = 40;
		boolean isPrime=true;
		
		for (int i =2; i<num/2;i++)
		{
			if(num%i==0)
			{
			
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{

			System.out.println("this is prime");
		}
		else
		{
			System.out.println("this is not prime");
		}
		}
	

	public static void main(String[] args) {
		PrimeNumberarenotCls obj= new PrimeNumberarenotCls();
				obj.PrimeNrNot();
	}

}
