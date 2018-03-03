package InputoutFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serilizationdata implements Serializable{

	 int id ; 
	 String name;
	 
	 serilizationdata()
	 {
		 this.id=100;
		 this.name="name";
	 }
	 
	 public void outputmethod() throws IOException{
		 
			try
			{
				serilizationdata obj = new serilizationdata();
				FileOutputStream fos = new FileOutputStream("E:\\hello.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(obj);
				oos.close();
				fos.close();
			}
			catch (FileNotFoundException e)
			{

				e.printStackTrace();
			} 
			}
	 
	 public void inputmethod() throws IOException, ClassNotFoundException{
		    serilizationdata obj1;
			FileInputStream fos = new FileInputStream("E:\\hello.txt");
			ObjectInputStream oos = new ObjectInputStream(fos);
			obj1 = (serilizationdata) oos.readObject();
	
			oos.close();
			fos.close();
			System.out.println(obj1.id);
			System.out.println(obj1.name);
	 }
		 
	 
		 
	 
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		serilizationdata obj=new serilizationdata();
		obj.outputmethod();
		obj.inputmethod();
	
	}
}





