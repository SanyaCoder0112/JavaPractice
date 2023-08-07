package oops_practive.librarySystem;
import java.util.Scanner;
public class Main {
     public static void main(String [] args) {
    	 {
    		 Scanner input = new Scanner(System.in);
    		 System.out.println("*************Welcome to the ABC Library**************");
    		 System.out.println(" Select from the following options: ");
    		 System.out.println("*******************************************************************************");
    		 books ob = new books(); 
    	     
    		 students obStudent = new students();
    		 

    	        int choice;
    	        int searchChoice;
    	        do {
    	        	 
    	            ob.dispMenu();
    	            choice = input.nextInt();
    	            
    	            switch (choice) {
    	            
                    // Case
                case 1:
                    book b = new book();
                    ob.addBook(b);
                    break;
     
                    // Case
                case 2:
                    ob.upgradeBookQty();
                    break;
     
                // Case
                case 3:
     
                    System.out.println(
                        " press 1 to Search with Book Serial No.");
                    System.out.println(
                        " Press 2 to Search with Book's Author Name.");
                    searchChoice = input.nextInt();
     
                    
                    switch (searchChoice) {
    	 }
      1
     	 
    	 
     }
}
