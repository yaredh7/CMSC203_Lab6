public class SavingsAccount extends BankAccount {
	
	//Variables
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	
	//Create savings account
	public SavingsAccount(String name, double amount) {
		
		super(name, amount);
		
		//Add savings account extension
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	
	//Create another savings account for the same person
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		
		super(oldAccount, amount);
		
		savingsNumber = oldAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	
	//Calculate and deposit one month of interest
	public void postInterest() {
		
		deposit(getBalance() * rate / 12);
	}
	
	
	//Get account number with savings extension
	@Override
	public String getAccountNumber() {
		
		return accountNumber;
	}

}
