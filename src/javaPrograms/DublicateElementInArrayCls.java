package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class DublicateElementInArrayCls {

	public static void main(String[] args) {

		//String names[]={"Dell","munna","Sharath","BHarath","BHarath"};
		
		
		
		Integer[] names={121,123,121,122,123};

		
		for(int i=0;i<names.length;i++){
			
			for(int j=i+1;j<names.length;j++){
				
				if(names[i]==names[j]){
					
					System.out.println("Duplicates values is:"+names[i]);
				}
			}
					//System.out.println("****************");	
			//2 Solution 
			
			/*Set<Integer> store=new HashSet<Integer>();
			for(Integer name : names){
				if(store.add(name)==false){
					
					System.out.println("Duplicate value is : "+name);
				}
			*/	
				
			}
			
			
		}
		}
				
				
			
		
		
	


