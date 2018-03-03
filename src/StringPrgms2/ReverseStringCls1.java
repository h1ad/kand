package StringPrgms2;

public class ReverseStringCls1 {
	
	public void RecStr(){
		
		String str = "Bharath";
		
		// convert string to Char by usnig CharArray
		
		char[] Rev=str.toCharArray();
		
		for(int i = Rev.length-1;i>=0;i--){
			System.out.print(Rev[i]);
		}
	}

	public static void main(String[] args) {
		
		ReverseStringCls1 obj = new ReverseStringCls1();
		obj.RecStr();

	}

}
