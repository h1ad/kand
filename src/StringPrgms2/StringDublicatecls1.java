package StringPrgms2;

public class StringDublicatecls1 {
	
	public void Stringdub(){
		String str = "Bharath";
		int cnt=0;
		
		char[] dublicateChar=str.toCharArray();
		System.out.println("dubLicate Charters are:");
		
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				
				if (dublicateChar[i]==dublicateChar[j]){
					System.out.println(dublicateChar[j]);
					cnt++;
					break;
				}
				
			}
			
		}
	}

	public static void main(String[] args) {

		StringDublicatecls1 obj= new StringDublicatecls1();
		obj.Stringdub();
		
	}

}
