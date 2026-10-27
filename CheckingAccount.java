public class CheckingAccount extends BankAccount {
	
	//Variables
	private static final double FEE = 0.15;
	
	
	//Create checking account
	public CheckingAccount(String name, double amount) {
		
		super(name, amount);
		
		//Add checking account extension
		setAccountNumber(super.getAccountNumber() + "-10");
	}
	
	
	//Withdraw amount and include the fee
	@Override
	public boolean withdraw(double amount) {
		
		return super.withdraw(amount + FEE);
	}

}
