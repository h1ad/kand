package StringPrgms;

public class RemoveJunkCls {

	public static void main(String[] args) {

		String str= "!@#$@!@!%& bharath kanduri";
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
	}

}
