package com.jspiders.bank.object;

 
import com.jspiders.bank.account.Account;

public class Deposite
{  
	private int depositeAmount;
 private Account account;
    
   
	
  public Deposite(Account account,int depositeAmount)
{
 this.account=account;
 this.depositeAmount=depositeAmount;
}
  public void deposite()
  {
	  account.accountBalance+=depositeAmount;
	  System.out.println("Amount deposited  is "+ depositeAmount);
  }
	 
}
