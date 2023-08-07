package practiceProgramIkea6Aug;

public class CalculateSimpleInterest {
	static int simpleIntrest(int p, int t, int r){
        int si=0;
        si=(p*r*t)/100;
        return si;
}
public static void main(String[] args){
     int simpintrest=simpleIntrest(10000, 2, 5);
     System.out.println("The simple intrest is: " +simpintrest);

}
}