package javaPrograms;

public class SmallandLargeNumberInArray {

	public static void main(String[] args) {
        
		//array of 10 numbers
		
        int numbers[] = {1,2,3,-4};
       
        //assign first element of an array to largest and smallest
        
        int smallNumber = numbers[0];
        int largeNumber = numbers[0];
       
        for(int i=1; i< numbers.length; i++)
        {
                if(numbers[i] > largeNumber)
                	largeNumber = numbers[i];
                
                else if (numbers[i] < smallNumber)
                	smallNumber = numbers[i];
               
        }
       
        System.out.println("Largest Number is : " + largeNumber);
        System.out.println("Smallest Number is : " + smallNumber);
}

	}


