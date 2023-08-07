//package practiceProgramIkea6Aug;
//
//public class CountOfDigits {
//	public static int countingDigits(Integer num) {//integer is non primitive data type Integer is also a class along with being datatype , if we are using Integer it is purely object oriented programming
//		String numString =num.toString();
//		int count=0;
//		count=numString.length();
//		return count;
//		
//	}
//	public static void main(String[] args) {
//		CountOfDigits obj=new CountOfDigits();
//		int counting=obj.countingDigits(4235);
//		System.out.println("Counting of the number of digits is: " +counting);
//	}
//}

package practiceProgramIkea6Aug;
  public class CountOfDigits {
	  static int countDigit(int num) {
		  int count=0;
		  while(num!=0) {
			  num=num/10;
			  count++;
		  }
		  return count++;
	  }
	  public static void main(String[] args) {
		int counting=countDigit(42355);
		System.out.println("The total number of digits are: " +counting);
	  }
  }