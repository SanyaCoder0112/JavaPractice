package practice_assignment1.question16;

import java.util.Scanner;

public class StudentAttendence {
	//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
	//Take following input from user
	//Number of classes held
	//Number of classes attended.
	//And print
	//percentage of class attended
	//Is student allowed to sit in exam or not.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of attended classes");
		int attendedClass = sc.nextInt();
		System.out.println("Total numer of classes");
		int NumOfClass = sc.nextInt();
		if (attendedClass >= ((75 / 100) * NumOfClass)) {
			System.out.println("The student can sit for exam");
		} else {
			System.out.println("Not eligible to sit in exam");
		}
	}
}
