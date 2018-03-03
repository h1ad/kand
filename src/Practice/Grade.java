package Practice;

public class Grade {
	
	public void Gradeforstudent()
	
	{
		int student=50;
		if(student>30 &student < 35 )
		{
			System.out.println("student passed");
		}
		else if (student>35 &student < 60 )
		{
			System.out.println("student passed in second class");
		}
		else if (student>60 & student < 70 )
		{
			System.out.println("student passed in First class");
		}
		else if (student>70 &student < 100 )
		{
			System.out.println("student got top rank");
		}
		
	}

	public static void main(String[] args)
	{

		Grade gradeforstudents = new Grade();
		gradeforstudents.Gradeforstudent();
	}

}
