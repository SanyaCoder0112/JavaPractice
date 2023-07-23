package practice_assignment1.Question39;
import java.util.Scanner;
public class ReverseFirstHalfOfString {
	//Reverse the first half of the string. for ex- "abcde" -> "bacde"
	//another ex- "abcdef" -> "cbadef"
	public static void main(String[] args) {
		String str="Ankita Mishra";
		int mid=str.length()/2;
		String newFirsthalf="";
		String firsthalf=str.substring(0,mid);
		String secondhalf=str.substring(mid,str.length());
		for(int i=firsthalf.length()-1;i>=0;i--)
		{
			newFirsthalf=newFirsthalf+firsthalf.charAt(i);
		}
		 //search in google and do
				System.out.println("new result after reversing first half will be "+newFirsthalf+secondhalf);
	}
}
