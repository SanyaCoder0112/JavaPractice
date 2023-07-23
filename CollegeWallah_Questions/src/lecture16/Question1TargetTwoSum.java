package lecture16;

import java.util.Arrays;

public class Question1TargetTwoSum {
	public static int numberOfPairs(int[] a, int k ){
		//this is first , method using binary search apraoach and it is having n(logn) time complexity  
	    int len = a.length;

	    if (len == 0){
	      return -1;
	    }
	    Arrays.sort(a);
	    int count  = 0, left = 0, right = len -1; 

	    while( left < right ){

	        if ( a[left] + a[right] == k  ){

	            count++; 

	            if (a[left] == a[left+1] && left < len-1 ){
	              left++;
	            }

	            if ( a[right] == a[right-1] && right >1 ){
	              right-- ; 
	            }

	            right--; // right-- or left++, otherwise, will get struck in the while loop 
	        }

	        else if ( a[left] + a[right] < k ){
	          left++;
	        }

	        else {
	          right--;
	        }
	    }

	    return count; 
	}
	
	// count number of sum of pairs of two elements of array which is equal to target element this is brute force aproach and its time complexity is n*n
	public static int countNumberofPair(int[] arr, int k)
	{
	int count=0;
	int n=arr.length;
    for(int i=0;i<n-1;i++) {
	for(int j=i+1;i<n-2;j++) {
		if(arr[i]+arr[j]==k)
	count++;
	}
    }
		return count;
	}
	
	public static void main(String []args ) {
		
	
	int arr[]= {4,3,8,9,6,1,7,5};
    int target=12;
    int count1 =numberOfPairs(arr,target);
    int count2=countNumberofPair(arr,target);

    

	System.out.println(count1);
    System.out.println("using second brute force method " +count2);
	
	

	}
}