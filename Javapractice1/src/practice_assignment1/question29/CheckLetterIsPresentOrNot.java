package practice_assignment1.question29;
import java.util.Scanner;
public class CheckLetterIsPresentOrNot {
	//Write a program to check if the letter 'e' is present in the word 'Umbrella'.

	public static void main(String[] args) {
		String str=" Umbrella ";
		if(str.contains("e"))
		System.out.println("e is present ");
		else
			System.out.println("e is not present ");
	}
}
