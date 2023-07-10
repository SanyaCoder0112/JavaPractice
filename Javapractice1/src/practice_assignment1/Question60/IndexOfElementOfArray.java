package practice_assignment1.Question60;

//Write a Java program to find the index of an array element.
import java.util.Scanner;

public class IndexOfElementOfArray {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements ");
int n=sc.nextInt();
int Index=0;
int[] arr=new int[n];
System.out.println("Enter the value of x");
int x=sc.nextInt();
for(int i=0;i<n;i++){
if(arr[i]==x){
Index==i;
System.out.println("The index of x is " +Index);
}
else{
System.out.println("-1");
}
}
}
}
