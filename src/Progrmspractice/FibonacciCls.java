package Progrmspractice;

public class FibonacciCls {
	
	public void fibo()
	{
		
	// 1 1 2 3 5 8 13 21 34 55 59 ---- fibo series 
	int k=0, a=1 ,b= 1;
	
	System.out.println("1 1 ");
	while(k<=50)
	{
		k =a+b;
		System.out.println(k + "  ");
		a=b;
		b=k;
	}	
		
	}

	public static void main(String[] args) 
	{
		FibonacciCls obj = new FibonacciCls();
		obj.fibo();
		

	}

}
