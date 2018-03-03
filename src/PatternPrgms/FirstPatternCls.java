package PatternPrgms;

import java.util.Scanner;

public class FirstPatternCls {
	
   public void Pattern1(){
	   
   
	    {
	    	int i, j;
	        Scanner sc = new Scanner(System.in);
	         
	        //Taking rows value from the user
	         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");
	         
	        for (i = 1; i <= rows; i++) 
	        {
	            for (j = 1; j <= i; j++)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }
	         
	        //Close the resources
	         
	        sc.close();
	    }

   }
	public static void main(String[] args) {
		
		FirstPatternCls obj =new FirstPatternCls();
		obj.Pattern1();

	}

}
