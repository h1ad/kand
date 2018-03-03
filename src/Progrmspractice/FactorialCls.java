package Progrmspractice;

public class FactorialCls {

	public void Fact1()
	{
		
		int num = 5;
		int fact= 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
			System.out.println(fact);
		}
	}
	public static void main(String[] args) {
		FactorialCls obj =new FactorialCls();
		obj.Fact1();
	}

}
