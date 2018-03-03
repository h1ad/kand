package Practice;

public class Array {
	
	public void Arraystring()
	{
	   String str[]={"hello","Hi","bye2","hello1"};
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
	}
	public void Arrayint()
	{
	   int arr[]={123,223,323,423};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
	}

	public static void main(String[] args) {
		Array a1 = new Array();
		a1.Arraystring();
		Array a2 = new Array();
		a2.Arrayint();
	}

}
