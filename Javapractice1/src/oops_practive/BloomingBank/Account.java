package oops_practive.BloomingBank;
import java.util.Scanner;
//account_java

public class Account {
	Scanner sc=new Scanner(System.in);
//number, ....phonenumber are attribute .....Attributes is used as data which we used all over the program ............//i.e. attributes stores data
	public String accountNumber;
	public double balance;
	public String email;
	public String phoneNumber;
	public String name;
	public String accountType;
	public String pinNumber;
	

	public Account(String pinNumber, String AccountType, String Number, double balance, String Name, String Email, String PhoneNumber) {
////this is constructor of Account class it is used to pass value to the atrriibutes of the class whenever we create
		// object for class constructor is automaticlly no need to call it
		this.accountNumber = Number;
		this.balance = balance;
		this.name = Name;
		this.email = Email;
		this.phoneNumber = PhoneNumber;
		this.accountType=AccountType;
		this.pinNumber=pinNumber;
	}
	
	//setting values of number , balance, etc. 
	// use another function to take user inut and pass it into construct of the accou t to set the avlues of attrubutes 
	public createCustomer()
	   {
		    System.out.println("Enter your account number:");
		    this.accountNumber = sc.next();
		    System.out.println("Your balance is :");
		    this.balance = sc.nextDouble();
		    System.out.println("Enter your email id: ");
		    this.email=sc.next();    
		    
		    //by using "this" and . (dot) we can access all the atributes of this class in which we are present 
		    // this keyword is used to access all the attribute of my present class generally its used to assign value to the attribute vraible 
		   
		    System.out.println("enter your phone number :");
		    this.phoneNumber= sc.next();
		    System.out.println("enter your name :");
		    this.name= sc.next();
		    System.out.println(" Enter your account type: ");
		    this.accountType = sc.next();
		    System.out.println(" Enter your pin number: ");
		    this.pinNumber = sc.next();
	   }
	
	
	//getters are used to get the values of attributes of object
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	//setters are used to  
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return this.name;
	}

	public void setNames(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String AccountType) {
		this.accountType = AccountType;
	}
	public String getPinNumber() {
		return this.pinNumber;
	}

	public void setPinNumber(String PinNumber) {
		this.pinNumber = PinNumber;
	}
}