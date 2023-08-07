//Objects are real life entities
//Class are blueprint


//multiple clsses each explaining different topic 
package youtubeOopsCollegeWallah;

public class StudentClass {
    public static class Student{
    	String name;
    	int rno;
    	double percent;
    
    }
// from line number 5 to line number 11 we are making our OWN DATA TYPE WHICH IS THE SPECIALISATION OF OOPS
    public static void main(String[] args) {
    	Student x=new Student(); //declaration
//this line number 14 will make 3 boxs or 3 spaces each fo rname, rno,percent
    	x.name = "Raghav";
    	x.rno = 76;
    	x.percent = 92.5;
    	System.out.println(x.name);
    	System.out.println(x.rno);
    	System.out.println(x.rno + 8);
    	System.out.println(x.percent);
//System.out.println(x) only writing x inside will print youtubeOopsCollegeWallah.StudentClass$1d251891
//so we will need to write the whole thing i.e x.name or x.rno or x.percent 
// also if for example i want to add any vlue in the initialised value in x.rno 
// we will write like System.out.println(x.rno + 8);
    

// IF WE DON'T USE OOPS WE WILL HAVE TO MAKE 3 DIFFERENT ARRAY BUT HERE LINE 6 public static class student{  - this is itself a datatype 
//and we make array of this datatype Student(similar o how we make array of string,int,etc) 
//here which can store many other datatypes from string to int and other standard datatypes in it 

		Student s1 = new Student();
		s1.name = "Ravi";
		s1.rno = 77;
		s1.percent = 95.5;
        System.out.println(s1.name);
		
		Student s2 = new Student();
		s2.name ="Akshita";
		s2.rno =78;
		s2.perwwv3vvwcent=90.0;
		System.out.println(s2.name);
    }
}

//Array v/s Class 
// Array is needed to store multiple elements of only similar dataype 
//Class(user defined datatype) ek ayesa object creat karta hai jisme bahut saara data type hota hai aur bahut saara multipler attribute ya properties hota hai





/*   public static Cars{
	  String name;
	  String type;
	  int price;
   }
   public static void main(String[] args) {
	   Car c1 = new Car {
	      c1.name ="Mercedes Benz A";
	      c1.price =3000000;
	      c1.type ="hatchback";
	      System.out.println(c1.name);		   
	   }

}
*/