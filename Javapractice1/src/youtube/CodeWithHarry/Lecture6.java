package youtube.CodeWithHarry;
import java.util.Scanner;
public class Lecture6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sumOfMarksObtained=0;
		double  percentage=0.0f;
		int totalMarks=500;
		System.out.print
("Enter marks obtained out of 100 in 1st subject ");
		int marks1=sc.nextInt();
		     
		System.out.print("Enter marks obtained out of 100 in 2nd subject ");
		int marks2=sc.nextInt();
		if(marks2>100) {
	    	 System.out.println("invalid input");
	     }
		System.out.print("Enter marks obtained out of 100 in 3rd subject ");
		int marks3=sc.nextInt();
		if(marks3>100) {
	    	 System.out.println("invalid input");
	     }
		System.out.print("Enter marks obtained out of 100 in 4th subject ");
		int marks4=sc.nextInt();
		if(marks4>100) {
	    	 System.out.println("invalid input");
	     }
		System.out.print("Enter marks obtained out of 100 in 5th subject ");
		int marks5=sc.nextInt();
		if(marks5>100) {
	    	 System.out.println("invalid input");
	     }
		sumOfMarksObtained=marks1 + marks2 + marks3 + marks4 + marks5;
		
		percentage=(totalMarks/100)*sumOfMarksObtained;
		System.out.println("The percentage marks of the student is " +percentage);
		// float and string
	
	}

}
