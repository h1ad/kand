package StringPrgms2;

public class SplitAStringCls {

	public void StrSplit(){
		
		String str = "Bharath Kanduri Kumar";
		String[] WOrds=str.split("\\s");
		
		for(String W :WOrds){
			System.out.println(W);			
		}
		
	}
	public static void main(String[] args) {
		
		SplitAStringCls obj = new SplitAStringCls();
		
		obj.StrSplit();
	}

}
