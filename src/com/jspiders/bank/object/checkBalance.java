package com.jspiders.bank.object;

import com.jspiders.bank.account.Account;

public class checkBalance
{
   Account account;
private double curr_amount;
 public checkBalance(Account account)
{
	 this.account=account;
}
 public void checkbalance()
 {
	 this.curr_amount=  account.accountBalance;
	 System.out.println("CURRENT BALANCE IS "+curr_amount);
 }
 
}
