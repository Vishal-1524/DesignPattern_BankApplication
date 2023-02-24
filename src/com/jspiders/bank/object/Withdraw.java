package com.jspiders.bank.object;

import com.jspiders.bank.account.Account;

public class Withdraw 
{
    
	 private Account account;
	private int withdrawAmouont;

	public Withdraw(Account account,int withdrawAmouont) 
	{
		this.account=account;
		this.withdrawAmouont=withdrawAmouont;
	}
	public void withdraw()
	{
		account.accountBalance-=this.withdrawAmouont;
		System.out.println("Withdrawn amount is "+ withdrawAmouont);
	}
}
