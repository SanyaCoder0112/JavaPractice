package practice_assignment1.question38;
import java.util.Scanner;
public class PrintInitialsOfString {
	//38. Take string as input and print only the initials of them. for example- 
	//"Computer Science" -> "CS"
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="Computer Science";
		String newStr="";
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch>='A' && ch<='Z'){
		        newStr+=ch;
		    }
		    }
		    System.out.println(newStr);
	}
}
