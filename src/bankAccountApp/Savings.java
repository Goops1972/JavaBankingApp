package bankAccountApp;

public class Savings extends Account{
	
	//list properties specific to the saving accounts

	private	int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//constructor to initialize seeting fro the saving properties
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber =1+accountNumber;
		setSafetyDepositBox();
		
	}
	
	
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random()* Math.pow(10, 4));
	}



	//list any methods specific to saving account
	public void showInfo(){
		System.out.println("ACCOUNT TYPE : Saving");
		super.showInfo();
		System.out.println(
				"Your Saving Features "+
					"\n SafetyDeposit Box ID : "+safetyDepositBoxID+
				"\n Safety Deposit Box Key : "+safetyDepositBoxKey);
	}



	@Override
	public void setRate() {
		rate = getBaseRate()- .25;
	}
	

}
