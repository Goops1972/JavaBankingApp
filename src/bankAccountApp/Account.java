package bankAccountApp;

public abstract class Account implements IBaseRate{

	//list common propoerties for saving and checking accounts
	private String name;
	private String ssn;
	private double balance;

	static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	
	//constructor to set base properties and initialize the account
	public Account(String name, String ssn, double initialDeposit){
		this.name = name;
		this.ssn = ssn;
		this.balance = initialDeposit;
//		System.out.println("name : "+name+" ssn = "+ssn+" Balance : $"+balance);
		
		//set account number
		index++;
		this.accountNumber = setAccountNumber();
//		System.out.println("Account Number : "+ this.accountNumber);
		setRate();
	}

	public abstract void setRate();
	
	private String setAccountNumber(){
		
		String lastTwoOfSSN = ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random()*Math.pow(10,3));
		return lastTwoOfSSN+uniqueID+randomNumber;
	}
	
	public void compound(){
		double accuredInterest = balance*(rate/100);
		balance = balance+accuredInterest;
		System.out.println("Accured Interest: $ "+accuredInterest);
		printBalance();
	}
	//list common methods - Transatons
	public void deposit(double amount){
	balance = balance+amount;	
	System.out.println("Depositing amount : "+amount);
	printBalance();
	}
	
	public void withdraw(double amount){
		balance = balance+amount;
		System.out.println("Withdrawing amount : "+amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount){
		balance = balance - amount;
		System.out.println(" Transferring $"+amount+ " to "+toWhere);
		printBalance();
	}
	
	public void printBalance(){
		System.out.println("Your balance is now : $ "+balance);
	}
	
	public void showInfo(){
		System.out.println("Name : "+name+
				"\nACCOUNT NUMBER: "+accountNumber+
				"\nBALANCE : "+balance+
				"\nRATE : "+rate+ "%");
	}

}
