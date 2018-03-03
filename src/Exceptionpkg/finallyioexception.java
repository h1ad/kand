package Exceptionpkg;

import java.io.IOException;

public class finallyioexception {
	public void disp(int x) throws IOException
	{
		if (x>20)
			throw new IOException("exception");
		else
			System.out.println("Hello");
	}
	
	public static void main(String[] args) throws IOException {
		finallyioexception obj =new finallyioexception();
		obj.disp(5);

	}
	
	}


