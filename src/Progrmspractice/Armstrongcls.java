package Progrmspractice;

public class Armstrongcls {
	
	/*153 = 1 5 3
	 *  
			1* 1* 1 + 5* 5* 5+ 3* 3* 3
			1 + 125 + 27 
			153 / this is Armstrong
	*/
	public void AmstrongPrgm()
	{
		int n= 153;
		int temp = n;
		int r , sum =0;  // r to store the value 3 in 153 
				
		while(n>0)
		{
			
		r = n%10;
		n=n/10;
		sum= sum +r*r*r;
		
		}
		
		if(temp ==sum){
		
			System.out.println("this is armstrong");}
			else
			System.out.println("this is not armstrong");
			
			}
		
    	public static void main(String[] args) {
    		
    		Armstrongcls obj= new Armstrongcls();
    		obj.AmstrongPrgm();
    	
	}

} 
