package PatternPrgms;

public class Pattern3Cls {
	
	public void pattern3()
	{
		int number = 5;
        int count = number - 1;
        
        for (int k = 1; k <= number; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        
        count = 1;
        
        for (int k = 1; k <= number - 1; k++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count++;
            for (int i = 1; i <= 2 * (number - k) - 1; i++)
                System.out.print("*");
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		Pattern3Cls obj = new Pattern3Cls();
		obj.pattern3();
		
	}

}
