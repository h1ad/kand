package Collections;

import java.util.HashSet;

public class HashSetcls {
	
	public void HashSet()
	{
		HashSet<String> HashSet1 = new HashSet<String>();
		HashSet1.add("hello1");
		HashSet1.add("hello2");
		HashSet1.add("hello3");
		HashSet1.add("hello3");
		//Array1.clear();
	    
		//Array1.removeAll(Array1);
		//Array1.remove(1);
		
		System.out.println(HashSet1);
		
	}
	public void HashSetInteger()
	{
		HashSet<Integer> hashset2 = new HashSet<Integer>();
		hashset2.add(1);
		hashset2.add(2);
		hashset2.add(3);
		hashset2.add(3);

		//Array1.removeAll(Array1);
		System.out.println(hashset2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetcls obj =new HashSetcls();
		obj.HashSet();
		obj.HashSetInteger();
		

	}

}
