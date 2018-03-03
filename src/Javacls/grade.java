package Javacls;

public class grade {
	
	public void Grade1()  
	{
		int student =10;
		     if(student > 0 & student < 35)
		    	 System.out.println("student fail");
		 else if (student >= 35 & student < 40)
			 	 System.out.println("grade c (passed)");
		 else if(student > 40 & student < 60)
			     System.out.println("Grade B");
		 else if(student > 60 & student <70)
				 System.out.println("grade A"); 
		 else if (student > 70 & student <100)
				 System.out.println("grade A+");
		 else if (student == 100)
			 System.out.println("Topper in college");
		 else if (student >100)
			 System.out.println("Error Occure");
		 
	}

	public static void main(String[] args){
		
			grade grade1 = new grade();
			grade1.Grade1();
	}

}
