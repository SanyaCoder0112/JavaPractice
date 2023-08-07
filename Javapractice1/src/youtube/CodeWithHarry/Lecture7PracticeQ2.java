//write a java program to calculate cgpa from marks

package youtube.CodeWithHarry;
import java.util.Scanner;
public class Lecture7PracticeQ2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cgpa=0;
		int numberOfGrades=3;
		System.out.print("enter the grade of first subject ");
		int grade1=sc.nextInt();
		System.out.print("enter the grade of second subject ");
		int grade2=sc.nextInt();
		System.out.print("enter the grade of third subject");
		int grade3=sc.nextInt();
		cgpa=(grade1+grade2+grade3)/numberOfGrades;
		System.out.println("cgpa of the student is " +cgpa); 
	}

}
