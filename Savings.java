package bankaccountapp;

public class Savings extends Account {
	
	// List properties specific to a savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize savings account properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN,initDeposit);
		accountNumber = "1" + accountNumber;	
		setSafetyDeposityBox();
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDeposityBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
 	}
	
	// List any methods specific to the savings account 
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Savings Account Features" +
				"\n Safety Deposit Box ID: " + safetyDepositBoxID +
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey 
		
				);
	}


}
  