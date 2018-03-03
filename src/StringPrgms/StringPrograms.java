package StringPrgms;

public class StringPrograms {

	public void Compare1()
	{
		String a = "Bharath";
		String b = "Dharath";
		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("both Strings are Equal");
		}
		else 
		{
			System.out.println("both Strings are not Equal");

		}
		}
	
     public void C2UandL(){
		
		String a= "Bharath";
		String b="BHARATH";
		
		System.out.println("Upper Case letters"+a.toUpperCase());
		System.out.println("Lower Case letters"+b.toLowerCase());
			
	}
		
	public void ConcatString(){
		
			String str = "Bharath";
			String str2 = str.concat("dell");
			System.out.println(str2);
			
		}
	
	public void LastpositionofSubStringMethod()
	{
		String Str= "Bharath kumar kanduri";
		
		System.out.println(Str.lastIndexOf("r"));
	}
	public void RemoveChar(){
		String str = "Bharath kumar Kanduri";
		System.out.println(removecharAt(str,3));
			
	}
	
	private String removecharAt(String str, int i) {
		
		return str.substring(0, i)+str.substring(i+1);
	}
	
	public void ReverseStr()
	{
		String s1 = "Bharath ";
		 
        // convert String to character array
        // by using toCharArray
        char[] Rev = s1.toCharArray();
 
        for (int i = Rev.length-1; i>=0; i--){
            System.out.print(Rev[i]);
        }
	}

	public void Replace()
	{
		String str = "BharathBh";
		System.out.println(str.replace('B','S'));
		System.out.println(str.replaceFirst("Bh", "Sh"));
		System.out.println(str.replaceAll("Bh", "Sh"));
	}
	
	public void Split2(){
		String str= "bharath kumar kanduri";
		String words []=str.split("\\s");

		for(String w :words){
			System.out.println(w);
		}
	}
public void dub1(){
		
		String Str= "Hello how are how";
		int cnt=0 ;
		char[] Dublicate=Str.toCharArray();
		System.out.println("dublicate Charecters are:");
		for (int i = 0; i < Str.length(); i++) {
			   for (int j = i + 1; j < Str.length(); j++) {
			    if (Dublicate[i] == Dublicate[j]) 
			    {
			     System.out.println(Dublicate[j]);
			     cnt++;
			     break;
			    }
			   }
		}
			
	}
	public static void main(String[] args) {
		
		StringPrograms obj = new StringPrograms();
		obj.C2UandL();
		obj.Compare1();
		obj.ConcatString();
		obj.dub1();
		obj.LastpositionofSubStringMethod();
		obj.Replace();
		obj.RemoveChar();
		obj.Split2();
		
		

	}

}
