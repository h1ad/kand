package Progrmspractice;

public class Pattern1 {
	
	public void m1(){
		
		for(int i=1;i<=8;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");							
			}
			System.out.println();
			}
		System.out.println("----------------------------------");
	}
	public void m2(){
		for(int i=1;i<=8;i++){
			
			for(int j=i;j<=8;j++){
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		Pattern1 obj =new Pattern1();
		obj.m1();
		obj.m2();

}
}
