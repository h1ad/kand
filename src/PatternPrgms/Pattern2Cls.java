package PatternPrgms;

import java.util.Scanner;

public class Pattern2Cls {

	public void Pattern2(){
		
		int i , j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number forPattern");
		int rows = sc.nextInt();
		System.out.println("here is your pattern");
		
		for (i =rows ; i>=1;i--)
		{
			for (j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
			
		
	}
	public static void main(String[] args) {
		Pattern2Cls obj = new Pattern2Cls();
		obj.Pattern2();
		
	}

}
