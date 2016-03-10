package accounting;
import java.util.Date;

public class Account {

		private int id = 0;  
		private double balance = 0.0;     
		private double annualInterestRate = 0.0;
		private Date dateCreated = new Date();
	
		
	public Account(){}
		
	public Account(int ID, double BALANCE){
		id = ID;
		balance = BALANCE;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated(){
		return dateCreated();
	}
	
	public double getMonthlyInterestRate(){
		return (annualInterestRate/12);
	}
	
	public void withdraw(double amountWithdrawn){
		balance -= amountWithdrawn;
	}
		
	public void deposit(double amountDeposited){
		balance += amountDeposited;
	}
	
}
