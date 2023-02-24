package com.jspiders.bank.account;

public class Account 
{
  public double accountBalance;	
  private static  Account account;
  Account(double accountBalance)
  {
	 this.accountBalance=accountBalance;
	  System.out.println(accountBalance);
  }
public static Account getaccount() 
{
	if(account==null)
	{
		account=new Account(1000);
 
}
	return account;
	
 
}
  
}
