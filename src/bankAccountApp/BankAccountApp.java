package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {

		List<Account> accounts = new LinkedList<Account>();

		// Read CSV file
		String file = "C:\\Users\\M096090\\Downloads\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);

		for (String[] accountHolder : newAccountHolders) {

			String name = accountHolder[0];
			String SSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);

//			System.out.println(name + " " + SSN + " " + accountType + " " + initDeposit);

			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, SSN, initDeposit));
			} else if (accountType.equals("Checking")) {
//				System.out.println("OPEN A Checking Account");
				accounts.add(new Checking(name, SSN, initDeposit));
			} else {
				System.out.println("Error Reading account Type");

			}
		}
		
		for(Account acc : accounts){
	
			System.out.println("\n*************************");
			acc.showInfo();
		}
		

	}

	/*
	 * Checking chk1 = new Checking("Tom Wilson","233485789", 1500); Savings
	 * savacc1 = new Savings("Rich Lowe", "383749231", 2500); //read csv files
	 * and create new account based on data
	 * 
	 * savacc1.compound(); savacc1.showInfo();
	 * 
	 * System.out.println("*****************"); chk1.showInfo();
	 */

}
