package practiceProgramIkea6Aug;

public class CheckNumberNegativeOrPositive {
	public static void posnegNumber(int num) {
		if(num>0) {
			System.out.println("The number is posiitve");
		}
		else if(num<0) {
			System.out.println("The number is negative");
		}
		else {
			System.out.println("Invalid Input");
		}
	
	}
	public static void main(String[] args) {
		posnegNumber(-11);
	}

}
