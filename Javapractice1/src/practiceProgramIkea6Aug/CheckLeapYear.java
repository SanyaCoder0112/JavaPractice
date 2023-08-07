package practiceProgramIkea6Aug;

public class CheckLeapYear {
	public static void leapYearOrNot(int year) {
		while(year>0) {
			if(year%4==0) {
				System.out.println("The year is a leap year");
			}
			else {
				System.out.println("the year is not a leap year");
			}
		}
	}
	public static void main(String[] args) {
		leapYearOrNot(2035);
	}

}
