package bankAccountApp;

public class Checking extends Account{

	//list properties specific to checking account

	private	int debitCardNumber;
	private int debitCardPIN;
	
	//construct to intialize checking account properties

	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = 2+accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate(){
		rate = getBaseRate()*.15;
	}
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random()*Math.pow(10, 12)); 
		debitCardPIN = (int) (Math.random()*Math.pow(10, 4));
	}

	//list any methods to  the checking account
	public void showInfo(){
		
		super.showInfo();
		System.out.println("Your Checking Account Features"+
		"\n Debit Card Number : "+debitCardNumber+
		"\n Debit Card PIN : "+debitCardPIN);
	}
	
}
