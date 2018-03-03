package Progrmspractice;

public class reverseString {
	
	
	  String[] str=new String[4];
	  String str1 = "Bittu";
	  
	  public void Reverse()
		{
			  for(int i=str.length;i>=0;i--)
			  {
				 System.out.print(str1.charAt(i));
			  }
	}

	public static void main(String[] args)
	{
		reverseString a1 = new reverseString();
		a1.Reverse();
	}

}
