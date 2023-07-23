package oops_practive.bankingSystem;

//account_java

public class Account {
//number, ....phonenumber are attribute .....Attributes is used as data which we used all over the program ............//i.e. attributes stores data
	private String Number;
	private double Balance;
	private String Email;
	private String PhoneNumber;
	private String Name;

	public Account(String Number, double balance, String Name, String Email, String PhoneNumber) {
////this is constructor of Account class it is used to pass value to the atrriibutes of the class whenever we create
		// object for class constructor is automaticlly no need to call it
		this.Number = Number;
		this.Balance = balance;
		this.Name = Name;
		this.Email = Email;
		this.PhoneNumber = PhoneNumber;
	}//setting values of number , balance, etc.

	public void depositMoney(double depositedMoney) {
		this.Balance += depositedMoney;
		System.out.println("Deposit is Succcessful, new Balance is " + this.Balance);
	}

	public void withDraw(double withDrawalMoney) {
		if (this.Balance - withDrawalMoney < 0) {
			System.out.println("WithDraw Unsuccessful only " + this.Balance + " is left");
		} else {
			this.Balance -= withDrawalMoney;
			System.out.println("WithDraw successful, Current Balance is " + this.Balance);
		}
	}

	
	//getters are used to get the values of attributes of object
	public String getNumber() {
		return Number;
	}

	//setters are used to  
	public void setNumber(String number) {
		Number = number;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public String getName() {
		return Name;
	}

	public void setNames(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getphoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

}