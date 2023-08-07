package oops_practive.librarySystem;

import java.util.*;
public class Book {
   private String sNo;
   private String authorName; // author 
   private String bookName;
   private String language;
   private String bookType;
   private String bookQtyCopy;
   
   // these all are the attributes or features of one particualr object  //   attribute is also datatype
   Scanner sc = new Scanner(System.in);
   // now we will craete constructor of this class which will be automatically called/invoked when we will create object for this class
   // constructor name is laways same as name of its parent class it can be never be different 
   // it has no return type it looks like a method without any return type 
   //all functions have a return type like void int string or float or double etc
   //lets create the constriuctor
   // this below constructor without any argument 
   public Book()
   {
	    System.out.println("enetr serial nummber for the book:");
	    this.sNo = sc.nextLine();
	    System.out.println("enter name of the book :");
	    this.bookName = sc.nextLine();
	    System.out.println("Enter author name: ");
	    this.authorName=sc.nextLine();             //by using "this" and . (dot) we can access all the atributes of this class in which we are present 
	    // this keyword is used to acces all the attribute of my present class generally its used to assign value to the attribute vraible 
	    System.out.println("enetr the type of the book :");
	    this.bookType= sc.nextLine();
	    System.out.println(" enter the language of the book : ");
	    
	    
	 
	    this.language = sc.nextLine();
   

   
   }
   // constructor with argument      //we are using constructor  to set the values of the class variables or attributes
   public Book(String sNo, String authorName, String bookName, String bookType, String language) {
	   this.sNo=sNo;// equal to ke pahle wala class ka attribute variable hai also known as main data or property of the class  
	   this.authorName=authorName;//( equal to ke baad wala authorName is argument's value from constructor input parameter
	   this.bookName=bookName;
	   this.bookType=bookType;
	   this.language=language;
   
   
   
   }


         public void setSNo() {
        	 this.sNo =sNo;
         }
         public String getSNo(String sNo) {
        	 return sNo; 
        	 
         }
         public void setAuthorName() {
        	 this.authorName=authorName;
         }
         public String getAuthorName(String authorName) {
        	 return authorName;
        	 
         
         } 
         
         public void setBookName() {
        	 this.bookName = bookName;
         }
         public String getBookName(String bookName) {
        	 return bookName;
         }
         
         public void setlanguage() {
        	 this.language = language;
         }
         public String getlanguage(String language) {
        	 return language;
         }
         
         public void setBookType() {
        	 this.bookType = bookType;
         }
         public String getbookType(String bookType) {
        	 return this.bookType;
         }
         }

         
         
         
         