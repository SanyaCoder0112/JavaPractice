package practiceProgramIkea6Aug;

public class CheckStudentEligiblityForScholarship {
	public static void eligiblityForScholarship(int mathsMarks, int scienceMarks, int totalMarks, int studentObtainedMarks) {
		float totalPercentage=0.0f;
		float combinedMathsSciencePercentage=0.0f;
		int mathsTotalMarks=100;
		int scienceTotalMarks=100;
		totalPercentage = (studentObtainedMarks/100)*totalMarks;
		combinedMathsSciencePercentage=((scienceMarks+mathsMarks)/100)*(mathsTotalMarks+scienceTotalMarks);
		if(totalPercentage>=60 || combinedMathsSciencePercentage>=60 || mathsMarks>=60) {
			System.out.println("The student is eligible for scholarship");
		}
		else {
			System.out.println("The student is not eligible of scholarship");
		}
	}
	public static void main(String[] args) {
		eligiblityForScholarship(5,5,400,111);
	}

}
