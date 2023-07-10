package practice_assignment1.Question39;
import java.util.Scanner;
public class ReverseFirstHalfOfString {
	//Reverse the first half of the string. for ex- "abcde" -> "bacde"
	//another ex- "abcdef" -> "cbadef"
	public static void main(String[] args) {
		String str="Sachin";
		 String result =str.substring(0,2);
				System.out.println(str.reverse(result));
	}
}
