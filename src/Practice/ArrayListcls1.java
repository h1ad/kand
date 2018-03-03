package Practice;

import java.util.ArrayList;

import Javacls.Array1;

public class ArrayListcls1 {
	
	public void ArrayL1()
	
		{
            // by Durga Sir
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("A");
		array1.add("10");
		array1.add("A");
		array1.add("null");
		System.out.println(array1);//[A,10,A,null]
		array1.remove(2);//[A,10,null]
		array1.add(2, "M");
		array1.add("N");
		System.out.println(array1);

		// By Ramesh sir RealTime
		/*ArrayList<String> arrray1 = new ArrayList<String>();
		arrray1.add("bha1");
		arrray1.add("bha2");
		arrray1.add("bha3");
		arrray1.add("bha4");
		arrray1.size();
		arrray1.get(1);
		//arrray1.add(1,"Bharath");
		arrray1.indexOf("Bharath");
		arrray1.isEmpty();
		arrray1.set(0, "Sathwik");
		
		//arrray1.remove(1);
		System.out.println(arrray1);
		//System.out.println(arrray1.size());
		//System.out.println(arrray1.get(1));
		//System.out.println(arrray1.indexOf("Bharath"));
	   // System.out.println(arrray1.isEmpty());
		
		ArrayList<String> arrray2 = new ArrayList<String>();
		arrray2.add("bhv1");
		arrray2.add("bhv2");
		arrray2.add("bhv3");
		arrray2.add("bhv3");
		*/
		

	}

	public static void main(String[] args) {

		ArrayListcls1 obj = new ArrayListcls1();
		obj.ArrayL1();
		
	}

}
