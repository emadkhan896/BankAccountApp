package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "C:\\Users\\emadk\\Downloads\\Data\\NewBankAccounts.csv";
		// Read a CSV File then create a new account based on that data
		
		/*
		Checking chkacct = new Checking("Emad Khan", "765432155",1000);
		Savings savacct = new Savings("Rohit Sharma", "435412344", 1500);
		savacct.compound();
		
		savacct.showInfo();
		System.out.println("***************************************");
		chkacct.showInfo();
		*/
		
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder: newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			//System.out.println(name + " " + sSN + " " + accountType + " " + initDeposit);
			
			if(accountType.equals("Savings") ) {
			 accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if(accountType.equals("Checking")) {
				 accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE!");
			}
		}
		
	 for(Account acc: accounts) {
		 System.out.println("\n**************");
		 acc.showInfo();
	 }

	}

}
