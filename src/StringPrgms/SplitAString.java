package StringPrgms;

public class SplitAString {
	
	/*public void Split1(){
		String str= "bharath-kumar-kanduri";
		String words []=str.split("-");
		
		for(int i =0;i<words.length;i++)
		{
			System.out.println(words[i]);
		} 
		
	}
*/ public void Split2(){
	String str= "bharath kumar kanduri";
	String words []=str.split("\\s");

	for(String w :words){
		System.out.println(w);
	}
}
	public static void main(String[] args) {

		SplitAString  obj = new SplitAString();
		//obj.Split1();
		obj.Split2();
		
	}

}
