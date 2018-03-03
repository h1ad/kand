package StringPrgms;

public class ReverseStringcls {
	
	public void ReverseStr()
	{
		String s1 = "Bharath ";
		 
        // convert String to character array
        // by using toCharArray
        char[] Rev = s1.toCharArray();
 
        for (int i = Rev.length-1; i>=0; i--){
            System.out.print(Rev[i]);
        }
	}
	
	

	public static void main(String[] args) {
		ReverseStringcls obj = new ReverseStringcls();
		//obj.ReverseStr();
		obj.ReverseStr();
		
	}

}
