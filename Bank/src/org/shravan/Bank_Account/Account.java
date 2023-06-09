package org.shravan.Bank_Account;

import java.util.Scanner;

public class Account {
	String account_holder_name; 
	String dob;
	String pin;
	double money;
	long anumber;
	
	Account a;
	
	public Account()
	{
		this.account_holder_name=account_holder_name;
		this.dob=dob;
		this.pin=pin;
		this.money=money;
		this.anumber=anumber;
	}
	public void AccountDetails()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Account holder name");
		account_holder_name=s.nextLine();
		
	        System.out.println("date of birth");
	        System.out.println("pin");
	        System.out.println("money");
	        System.out.println("anumber");
	       
	
	}

}
