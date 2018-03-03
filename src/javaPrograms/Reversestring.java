package javaPrograms;

public class Reversestring {
	
	
		String[] str = new String[6];
		String str1 = "bharath";
	public void Reversestring()
	{
		for(int i =str.length;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
		}
	}
	public static void main(String[] args)
	{
		Reversestring r = new Reversestring();
		r.Reversestring();
	}

	/*public static void main(String[] args) 
	{
		String str = "Bharath";
		 
        // convert String to character array
        // by using toCharArray
		
        char[] char1 = str.toCharArray();
 
        for (int i = char1.length-1; i>=0; i--)
            System.out.print(char1[i]);
	}
*/
}
