package Collections;

import java.util.ArrayList;

public class arraylistcls {
	
	public void ArrayListString()
	{
		ArrayList<String> Array1 = new ArrayList<String>();
		Array1.add("hello1");
		Array1.add("hello2");
		Array1.add("hello3");
		Array1.add("hello4");
		Array1.add("hello5");
		Array1.add("hello14");
		Array1.add("hello145");
		Array1.add("hello1456");




		//Array1.remove("3")
		//Array1.set(1, "bharath");
		//Array1.indexOf("hello3");
		//System.out.println(Array1.indexOf("hello3"));
		System.out.println(Array1);
		
		ArrayList<String> Array2 = new ArrayList<String>();
		Array2.add("hello");
		Array2.add("hello2");
		Array2.add("hello3");
		System.out.println(Array2);
		Array1.retainAll(Array2);
		System.out.println(Array2);
		
		
		/*Array1.addAll(Array2);
		System.out.println(Array1);
		Array1.removeAll(Array2);
		System.out.println(Array1);
*/
		/*Array1.removeAll(Array2);
		System.out.println(Array2);
		//System.out.println(Array1);
		*/
        
		
	}
	public static void main(String[] args) 
	{
		arraylistcls obj = new arraylistcls();
		obj.ArrayListString();
		//obj.ArrayListInteger();
		
	}

}
