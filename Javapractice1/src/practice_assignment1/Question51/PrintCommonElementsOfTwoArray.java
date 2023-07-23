package practice_assignment1.Question51;

import java.util.*;

public class PrintCommonElementsOfTwoArray {

	// 51.take two arrays of same size from user and print all the common elements
	// between them.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();

		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		System.out.println("please enter  all the elements of array 1");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
			//to take value inn array.
		}
		System.out.println("please enter  all the elements of array 2 ");
		for(int k=0;k<n;k++)
		{
			arr2[k]=sc.nextInt();
			//to take value inn array.
		}
		
		Set<Integer> resultSet = new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
		{
			if(arr1[i]==arr2[j])
			{
				resultSet.add(arr1[i]);
			}
		}
		}
		System.out.println(resultSet);
		
	
			
			
		
			
					
				
			
	}
}

////import java.util.*;  
//class HashSet1{  
//	 public static void main(String args[]){  
//	  //Creating HashSet and adding elements  
//	    HashSet<String> set=new HashSet();  
//	           set.add("One");    
//	           set.add("Two");    
//	           set.add("Three");   
//	           set.add("Four");  
//	           set.add("Five");  
//	           Iterator<String> i=set.iterator();  
//	           while(i.hasNext())  
//	           {  
//	           System.out.println(i.next());  
//	           }  
//	 }  
//	}  
//logic wrong do again