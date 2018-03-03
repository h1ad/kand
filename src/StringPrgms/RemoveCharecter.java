package StringPrgms;

public class RemoveCharecter {
	
	public void RemoveChar(){
		String str = "Bharath kumar Kanduri";
		System.out.println(removecharAt(str,3));
			
	}
	
	private String removecharAt(String str, int i) {
		
		return str.substring(0, i)+str.substring(i+1);
		//return str; 
	}


	public static void main(String[] args) {
		
		RemoveCharecter obj= new RemoveCharecter();
		obj.RemoveChar();

	}

}
