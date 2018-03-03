package javaPrograms;

public class DublicateValueInaStringcls {

	public static void main(String[] args) {

		String str= "Bharath"; //O/P : h a 
		//int count = 0;
		
		char[] dub=str.toCharArray();
		
		for(int i=0;i<str.length();i++){
			
			for(int j=i+1;j<str.length();j++){
				
				if(dub[i]==dub[j])
				{
					System.out.println(dub[j]);
					//count++;
					//break;
				}
			}
			
		
		}
		
		
	}

}
