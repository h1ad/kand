package Javacls;

public class nestedfor {
	
	public void nestedfrloop()
	{
		String[][] str={{"HI","HELLO"},{"HI1","HELLO2"}};
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++){
		System.out.println(str[i][j]);
			
			}
			}

	public static void main(String[] args) {

		nestedfor nestedf = new nestedfor();
		nestedf.nestedfrloop();
	}

}
	
