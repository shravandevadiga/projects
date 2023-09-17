package org.shravan.Bank_Account;

public class Bank {
	String bname;
	String branch;
	String ifsc_code;
	
	Account a;
	
	
	
     public Bank(String bname,String branch,String ifsc_code)

    {
    	 this.bname=bname;
    	 this.branch=branch;
    	 this.ifsc_code=ifsc_code;
    	 }
          
     public void bankDetails()
     {
    	 System.out.println("Bank name "+bname);
    	 System.out.println("The branch is"+branch);
    	 System.out.println("The IFSC code "+ifsc_code);
    	 if(a!=null)
    	 {
    		System.out.println(a.account_holder_name);
    		System.out.println(a.dob);
    		System.out.println(a.pin);
    		System.out.println(a.money);
    		System.out.println(a.anumber);

    	 }else
    	 {
    		 System.out.println("please create account first to check Account details");
    	 }
     }
     public  void createAccount(Account a)
     {
    	 a.AccountDetails();
    	 if (this.a==null) 
    	 {
    		System.out.println("Account successfully created");
			
		}else {
			System.out.println("Already account is existing");
		}
     }
     
     public void deposite(long anumber,double money)
     {
    	 if (a.anumber==anumber) 
    	 {
    		 if (money!=0)
    		 {
    			 a.money=a.money+money;
    			 System.out.println("Deposite money: "+money);
    				System.out.println("Total amount: "+a.money);
    			}
    	    	 else
    	    	 {
    				System.out.println("Enter valid amount");	
			   }
    	 } 
    	 else
    	 {
			System.out.println("Enter  valid Account number");
		}
      }
     
     public void withdraw(long anumber,double money)
     
     {
    	if (a.anumber==anumber) 
    	{
    		if (a.money>=money)
    		{
    			a.money=a.money-money;
    			System.out.println("Withdraw Amount: "+money);
    			System.out.println("Total Withdraw amount: "+a.money);
    			} 
    	    	else
    	    	{
    				System.out.println("Enter valid Account number");
    				
    			}
    		    }
    	         else 
    		    {
					System.out.println("Enter valid Account number");
				}		
		}
         
           public void deleteAccount() 
          {
			this.a=null;
			System.out.println("Account has been deleted completely");
		}
   }


 