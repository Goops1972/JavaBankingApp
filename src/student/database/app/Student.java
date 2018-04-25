package student.database.app;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance =0;
	private static int costOfCourse = 600;
	private static int id=1000;
	

	//constructor : prompt name and year
	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student First name : ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter Student Last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student class level :");
		this.gradeYear= in.nextInt();
		
		setStudentID();
	//	System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);
		
	}
	
	//generate and ID
	private void setStudentID(){
		id++;
		this.studentID = gradeYear+""+id;
	}
	//enroll in courses
	public void enroll(){
		//get inside a loop, user hit 0, keep enroling
		do{
			
		System.out.println("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		
		if(!course.equals("Q")){
			courses = courses +"\n"+course;
			tuitionBalance = tuitionBalance+costOfCourse;
		}
		else {
			System.out.println("Quitting !!");
			break;}
		
		} while (1!=0);
//		System.out.println("ENROLLED IN : "+courses);
//		System.out.println("TUTION BALANCE : "+tuitionBalance);
//		
	}
	//view balance
	public void viewBalance(){
		System.out.println("Your balance is : $"+tuitionBalance);
	}
	
	//pay tuition
	public void payTuiton(){
		viewBalance();
		System.out.println("Enter your payment : ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance-payment;
		System.out.println("Thank you for your payment $" +payment);
		viewBalance();
	}
	
	//show status
	public String toString(){
		return "Name : "+firstName+" "+lastName+
				"\nGrade Level = "+gradeYear+
				"\nStudent ID: "+studentID+
				"\nCourses Enrolled : "+courses+
				"\nBalance: $"+tuitionBalance;
	
	}
}
