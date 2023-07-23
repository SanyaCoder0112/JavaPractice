package practice_assignment1.Question56;

import java.util.Scanner;
public class ComputeAvgExceptLargestAndSmallestElement{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("Enter the number of elements ");
int n=sc.nextInt();
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
int[] arr=new int[n];
System.out.println("please enter  all the elements of array ");
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	//to take value inn array.
}
for(int i=0;i<n;i++){
//if(arr[i]<min){
//min=arr[i];
//}
//if(arr[i]>max){
//min=arr[i];
//}
		min=Math.min(arr[i], min);
		max=Math.max(arr[i], max);
        sum=sum+arr[i];
}

double avg=(double)(sum-min-max)/(n-2); //yahan typecasting kiya hai 
//integer ko integer se devide karne se hamesha integer hi result ata hai agar double result chahiye to numerator should b edouble 
System.out.println("The average is " +avg);


}}
