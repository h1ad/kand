package StringPrgms2;

public class RemoveCharecterCls1 {
	
	public void RmChar(){
		String str = "Bharath";
		
		System.out.println(RemoveCharAt(str,0));
			
	}

	
	private String RemoveCharAt(String str, int i) {
		
		return str.substring(0,i)+str.substring(i+1);
	}


	public static void main(String[] args) {
		
		RemoveCharecterCls1 obj = new RemoveCharecterCls1();
		obj.RmChar();
		

	}

}
