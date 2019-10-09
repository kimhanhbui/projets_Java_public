import java.time.LocalDate;

public class Account {

	private static int numAccount = 1;
	protected double balance;
	private int idAccount;
	private String operation ="";
	private double amount;
	 
//	Current date
	private LocalDate date = LocalDate.now();
	
//	Constructor create an account 
	Account (double b)
	{
		balance = b;
		idAccount = numAccount++;
	}
	
//	Deposit
	public void deposit(double amount) {
		balance +=amount;
		operation ="+";
	}
	
//	Withdrawal
	public double withdrawal(double amount) {
		
		operation = "-";
		
		if(balance >= amount) 
		{
			balance -= amount;
			return amount;
		}
		else
		{
			balance = 0.;
			return balance;
		}
	}
	
//	Get balance	
	public double getBalance() {
		return balance;
	}
	
// Get amount
	public double getAmount() {
		return amount;
	}
	
//	Get operation
	public String getOperation() {
		return operation;
	}
	
//	Get date
	public LocalDate getDate() {
		return date;
	}
	
	
	
	public String toString() {
		return "Account n°: "+ idAccount + " | " + date + " | " + operation + " | " + balance;
	}
 
}
