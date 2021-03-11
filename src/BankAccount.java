import java.util.UUID;

public class BankAccount implements BankOperasions{

	private String accountNumber = "";
	
	private String accountType = "";

	private double balance = 0.0;
	
	
	public BankAccount() {
		
		this.accountNumber = UUID.randomUUID().toString().substring(0,6);
		this.balance = 0.0;
		this.accountType = "Bank Account";
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}




	public String getAccountType() {
		return accountType;
	}




	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}




	public double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}


	
	public void withdrawMoney(double amount) {
		
		if(amount > 0) {
			
			setBalance(getBalance() - amount);
			
		} else {
			
			System.out.println("You dont have any money! ");
			System.out.println("You can not withdraw a negative or zero value!");
		}
	}
	
	
	public void depositMoney(double amount) {
	
		if(amount > 0) {
			
			setBalance(getBalance() + amount);
			
		} else {
			
			System.out.println("You dont have any money! ");
			System.out.println("You can not withdraw a negative or zero value!");
		}
	}


	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountType=" + accountType + ", balance=" + balance + "]";
	}
	
}
