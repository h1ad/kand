package StringPrgms2;

public class Compare2Strings {
	
	public void StringCompare(){
		
		String str1= "bharath";
		String str2= "bharath";
		
		//System.out.println("Comparing To Strings :"+str1.compareTo(str2));
		
		/*if(str1.equalsIgnoreCase(str2))
		{
		System.out.println("two Strings are = ");
		}
			else {
			
							System.out.println("TwoStrings are != ");
			}
		}*/
		
		
		if(str1.equals(str2))
		{
		System.out.println("two Strings are Equall");
		}
			else {
			
				System.out.println("TwoStrings arenot equally");
			}
		}
	
		public static void main(String[] args) {

		Compare2Strings obj =new Compare2Strings();
		obj.StringCompare();
		
	}

}
