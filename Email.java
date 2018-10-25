package emailApp;

import java.util.Scanner;

public class Email {

	private String emailAddress;
	private String alternateEmail;
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String companySuffix = "aeycompany.com";
	
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailBoxCapacity = 1000;
		
		// Call a method asking for the department - return the department
		this.department = this.setDepartment();
		
		// Call a method that returns a random password
		this.password = randomPassword(this.defaultPasswordLength);
		
		// Combine elements to generate email
		this.emailAddress = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "." + companySuffix;
	}
	
	private String randomPassword(int length) {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		
		char[] password = new char[length];
		
		for (int i = 0; i < length; i++) {
			
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	/**
	 * Return a string representation of a department.
	 * 
	 * The user will input the department of the person.
	 * 
	 * @return String
	 */
	private String setDepartment() {
		
		System.out.print("DEPARTMENT CODES\n1 for sales\n2 for Developement\n3 for Accounting\n0 for none\nEnter the department code for " + this.firstName + " " + this.lastName);
		
		Scanner in = new Scanner(System.in);
		
		int depChoice = in.nextInt();
		
		if (depChoice == 1) { return "sales"; }
		else if (depChoice == 2) { return "dev"; }
		else if (depChoice == 3) { return "acct"; }
		else { return ""; }
	}
	
	/**
	 * Sets the password to the new password
	 * 
	 * @param newPassword
	 */
	public void changePassword(String newPassword) {
		
		this.password = newPassword;
	}
	
	/**
	 * Set the mailbox capacity to a new capacity
	 * 
	 * @param capacity
	 */
	public void setMailBoxCapacity(int capacity) {
		
		this.mailBoxCapacity = capacity;
	}
	
	/**
	 * Sets an alternate email address
	 * 
	 * @param String
	 */
	public void setAlternateEmail(String altEmail) {
		
		this.alternateEmail = altEmail;
	}
	
	/**
	 * Returns the full name of the person
	 * 
	 * @return String
	 */
	public String getName() {
		
		return this.firstName + " " + this.lastName;
	}
	
	/**
	 * Returns the email address of the person
	 * 
	 * @return String
	 */
	public String getEmail() {
		
		return this.emailAddress;
	}
	
	/**
	 * Returns the mailbox capacity
	 * 
	 * @return int
	 */
	public int getCapacity() {
		
		return this.mailBoxCapacity;
	}
	
	public String toString() {
		
		return "Full Name: " + this.firstName + " " + this.lastName + "\n" + "Email Address: " + this.getEmail();
	}
}
