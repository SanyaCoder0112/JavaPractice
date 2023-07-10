package practice_assignment1.Question54;

import java.util.Scanner;

public class NumberOfEvenAndOddNumElements {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements ");
int n=sc.nextInt();

int counteven=0;
int countodd=0;
int[] arr=new int[n];
for(int i=0;i<n;i++){
if(i%2==0){
counteven++;
System.out.println("Number of even elements " +counteven);
}
else if(i%2!=0){
countodd++;
System.out.println("Number of odd eklements " +countodd);
}
}
}
}