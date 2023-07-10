package practice_assignment1.TestCase;

import java.util.Scanner;
public class Questions{
	
	//number of peak  element... previous and next element compare
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n=sc.nextInt();

int arr[]={1,2,1,3,6,4,7,5};

//System.out.println("enter the elemt of array");
//
for(int i=1;i<n-1;i++){
int peak=0;
if((arr[i]>arr[i-1]) && (arr[i]>arr[i+1])){
 peak++;
System.out.println("The number of peak elements are " +peak);

}
}
}
}


//{1,2,3,4,5,6}
//