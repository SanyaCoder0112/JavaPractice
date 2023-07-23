package oops_practive.bankingSystem;

public class Main {

	public static void main(String[] args) {
// here sanyasaccount is an object of account class its created and value is assigned to the instance variable of the class
//  
		Account sanyasAccount = new Account("1600110234", 900000, "Sanya", "sanyamishra4921@gmail.com", "9748816761");
		Account ankitaAccount = new Account("1600110235", 300000, "Ankita", "Ankitamishra4921@gmail.com", "9748816761");
		Account swetaAccount = new Account("1600110236", 800000, "Sweta", "swetamishra4921@gmail.com", "9748816761");
		Account roshanAccount = new Account("1600110237", 700000, "Roshan", "roshanmishra4921@gmail.com", "9748816761");
		Account papasAccount = new Account("1600110238", 600000, "Papa", "papamishra4921@gmail.com", "9748816761");

		// Account obj = new Account();
		System.out.println("hi  talented ji " + sanyasAccount.getName());
		System.out.println("hi  talented ji " + ankitaAccount.getName());
		System.out.println("hi  talented ji " + sanyasAccount.getBalance());
		System.out.println("hi  talented ji " + sanyasAccount.getEmail());
		System.out.println("ab hamlog juli ke accpount me 40000 deposit karenge kyunki salary aya hai");
		sanyasAccount.depositMoney(40000.00);
		System.out.println("hi  purana balance " + ankitaAccount.getBalance());
		ankitaAccount.depositMoney(50000.00);
		System.out.println("ab hamlog juli ke account see 900000 rs nikalnge Hyundai i20 sunroof car lene ke liye ");
		sanyasAccount.withDraw(90000.00);
		System.out.println("lets go to Kashmir trip");
		swetaAccount.withDraw(700000);

		sanyasAccount.withDraw(20000);

//      SanyasAccount.DepositMoney(DepositMoney: 500000);
//      SanyasAccount.depositMoney(DepositMoney: 400000);
//      SanyasAccount.WithDrawMoney(WithDrawalMoney: 150000);
	}
}
