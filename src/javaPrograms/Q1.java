package javaPrograms;

public class Q1 {
	
	public void m1(){
		
		int ascii[]={65,66,67,68};
		String s=new String(ascii,1,3);
		System.out.println(s);

	}
	
	public void m2(){
		double value =-9.0;
		System.out.println(Math.sqrt(value));
		System.out.println(12>>2);
		System.out.println(12>>3);

		
	}
      
	public static void main(String[] args) {
		
		Q1 obj = new Q1();
		obj.m1();
		obj.m2();

	}

}
