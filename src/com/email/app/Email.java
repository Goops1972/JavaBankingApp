package com.email.app;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private String alternativeEmail;
	private int defaultPasswordLength = 10;
	private String companyName = "gTech.com";

	// const
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastname = lastName;
//		System.out.println("Email Created : " + firstName + "." + lastName);

		// call method as for Department - return department
		this.department = setDepartment();
//		System.out.println("Department is : " + this.department);

		// call method to return a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : " + this.password);

		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyName;
//		System.out.println("Your email is : " + email);
	}

	// ask for department
	private String setDepartment() {

		System.out.println(
				"DEPARTMENT CODE\n1 Enter the department \n1 for Sales Sales\n2 for Development\n3 for Account\n0 for none");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();

		if (depChoice == 1) {
			return "Sales";
		} else if (depChoice == 2) {
			return "Dev";
		} else if (depChoice == 3) {
			return "acct";
		} else {
			return "";
		}

	}

	// generate password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGIHJKLPQRSTXYZ123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {

			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// set the mailbox capacity

	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}

	// set the alternative email
	public void setAlternativeEmail(String altEmail) {
		this.alternativeEmail = altEmail;
	}

	// change the password
	public void ChangePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity(){ return mailBoxCapacity;};
	
	public String getAlternateEmail(){return alternativeEmail;};
	
	public String getPasswor(){return password;};
	
	public String showInfo(){
		
		return "Displaying Name: "+firstName+" "+lastname+
				"\nCompany Email : "+email+
				"\nMail box Capacity : "+mailBoxCapacity+" mb";
		
	}
}