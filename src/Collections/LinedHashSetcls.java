package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinedHashSetcls {

	public void LinkedHaset1()
	{
		HashSet<String> LinkedHashSet1 = new HashSet<String>();
		LinkedHashSet1.add("hello1");
		LinkedHashSet1.add("hello2");
		LinkedHashSet1.add("hello3");
		LinkedHashSet1.add("hello3");
		//Array1.clear();
	    
		//Array1.removeAll(Array1);
		//Array1.remove(1);
		
		System.out.println(LinkedHashSet1);
		
	}
	public void LinkedHasetInteger()
	{
		LinkedHashSet<Integer> LinkedHashset2 = new LinkedHashSet<Integer>();
		LinkedHashset2.add(1);
		LinkedHashset2.add(2);
		LinkedHashset2.add(3);
		LinkedHashset2.add(3);

		//Array1.removeAll(Array1);
		System.out.println(LinkedHashset2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinedHashSetcls obj =new LinedHashSetcls();
		obj.LinkedHaset1();
		obj.LinkedHasetInteger();
		

	}

}
