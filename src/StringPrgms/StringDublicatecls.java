package StringPrgms;

public class StringDublicatecls {

	public void dub1(){
		
		String Str= "Bharath";
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
		
		StringDublicatecls obj = new StringDublicatecls();
		obj.dub1();
	}

}
