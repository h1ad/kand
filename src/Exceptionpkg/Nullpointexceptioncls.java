package Exceptionpkg;

public class Nullpointexceptioncls {

	public void nullpoint()
	{
		try {
			String str= "bharath";
			str=null;
			System.out.println(str.length());
			
		} catch (NullPointerException e) {
		
			System.out.println("nullpoint Exception error");
		}
	}
		public static void main(String[] args) {
		Nullpointexceptioncls obj = new Nullpointexceptioncls();
		obj.nullpoint();
	}

}
