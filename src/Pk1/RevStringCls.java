package Pk1;

public class RevStringCls {

	public static void main(String[] args) {
		
		String str= "Bharath";
		
		char[] Rev=str.toCharArray();
		
		for(int i=Rev.length-1;i>=0;i--)
		{
			
				System.out.print(Rev[i]);
			}
		}
	}


