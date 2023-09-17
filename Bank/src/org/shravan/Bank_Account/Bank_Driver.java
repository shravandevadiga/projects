package org.shravan.Bank_Account;

import java.util.Scanner;

public class Bank_Driver {
	private static Object account_holder_name;

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter bank name to open account");
		String bname=s.next();
		
		System.out.println("Enter address of bank");
		String loc=s.next();
		
		System.out.println("Enter bank  ifsc_code");
		String ifsc=s.next();
		Bank b=new Bank(bname, loc, ifsc);
		
		
		boolean option=true;
		while(option)
		{
			System.out.println("enter your choice");
			System.out.println("enter 1. for CREATE ACCOUNT");
			System.out.println("enter 2. for CHECK DETAILS");
			System.out.println("enter 3. for DEPOSIT MONEY");
			System.out.println("enter 4. for WITHDRAW");
			System.out.println("enter 5. for DELETE ACCOUNT");
			System.out.println("enter 6. for EXIT OR CLOSE APPLICATION");
			
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:{
				System.out.println("enter name ");
				String name =s.next();
				
				System.out.println("enter dob");
				String dob=s.next();
				
				System.out.println("enter pin");
				String pin =s.next();
				
				System.out.println("enter money to deposit");
				double  money =s.nextDouble();
				
				System.out.println("enter account number of  your choice");
				long  anumber =s.nextLong();
				
				
				b.createAccount(new Account());
				System.out.println("====================");
				
			}
			break;
			
			case 2:{
				
				b.bankDetails();
				System.out.println("=================");
			}
			break;
			case 3:{
				System.out.println("enter acount number  to deposit money");
				long anumber1= s.nextLong();
				
				System.out.println("enter how much money u want to deposit");
				double money1=s.nextDouble();
				
				b.deposite(anumber1,money1);
			 System.out.println("================");
			
			}
			
			case 4:
			{
				System.out.println("enter account number to withdraw money");
				long anumber1=s.nextLong();
				
				System.out.println("eter how much money u want  to withdraw");
				double money1=s.nextDouble();
				
				b.withdraw(anumber1,money1);
				System.out.println("=============");
				
			}
			break;
			case 5:
			{
				b.deleteAccount();
					
			}
			break;
			case 6:
			{
				System.out.println("thank you"+ bname);
				System.out.println("have a good day");
				option=false;
				
			}
			break;
			default :
			{
				System.out.println("enter ur valid choice");
				break;
				
			}	
			}
			
		}
		
		
	}
	

}
