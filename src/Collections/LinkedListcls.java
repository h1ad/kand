package Collections;

import java.util.LinkedList;

public class LinkedListcls {

	public void LinkedList()
	{
		LinkedList<String> Linked1 = new LinkedList<String>();
		Linked1.add("hello1");
		Linked1.add("hello2");
		Linked1.add("hello3");
		Linked1.set(0, "dell");
		Linked1.add(2, "dell2");
		//Array1.clear();
	    
		//Array1.removeAll(Array1);
		//Array1.remove(1);
		
		System.out.println(Linked1);
		
	}
	/*public void LinkedListInteger()
	{
		LinkedList<Integer> Linked2 = new LinkedList<Integer>();
		Linked2.add(1);
		Linked2.add(2);
		Linked2.add(3);
		//Array1.removeAll(Array1);
		System.out.println(Linked2);
		
	}
*/

	public static void main(String[] args) {
		
		LinkedListcls obj = new LinkedListcls();
		obj.LinkedList();
		//obj.LinkedListInteger();
		
		// TODO Auto-generated method stub

	}

}
