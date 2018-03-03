package StringPrgms;

public class ReplaceStringcls {
	
	public void Replace()
	{
		String str = "BharathBh";
		System.out.println(str.replace('B','S'));
		System.out.println(str.replaceFirst("Bh", "Sh"));
		System.out.println(str.replaceAll("Bh", "Sh"));
	}

	public static void main(String[] args) {
		
		ReplaceStringcls obj =new ReplaceStringcls();
		obj.Replace();

	}

}
