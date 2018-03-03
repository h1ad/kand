package StringPrgms2;

public class ReplaceStringcls1 {
	
	public void R1(){
		
		String str = "BharathBh";
		System.out.println(str.replace("B", "S"));
		System.out.println(str.replaceAll("Bh", "DOne"));
		System.out.println(str.replaceFirst("Bh", "YZ"));
	
	}

	public static void main(String[] args) {
		
		ReplaceStringcls1 obj  = new ReplaceStringcls1();
		obj.R1();
		
	}

}
