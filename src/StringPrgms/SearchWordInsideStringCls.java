package StringPrgms;

public class SearchWordInsideStringCls {
	
	public void SearchaWordInsideaString(){
		
		String str= "kharath kumar";
		int intIndex=str.indexOf("bharath");
		if (intIndex==-1){
			
			System.out.println("bharath not fount");
		}
			else
			{
				System.out.println("bharath found");
		}
	}

	public static void main(String[] args) {
		SearchWordInsideStringCls obj =new SearchWordInsideStringCls();
		obj.SearchaWordInsideaString();
	}

}
