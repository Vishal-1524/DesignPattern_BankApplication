package com.jspiders.bank.accountmian;

import java.util.Scanner;

import com.jspiders.bank.account.Account;
import com.jspiders.bank.object.Deposite;
import com.jspiders.bank.object.Withdraw;
import com.jspiders.bank.object.checkBalance;

public class accountTransaction 
{
 private static Scanner scanner;
private static boolean bool=true;

public static void main(String[] args) 
{
	 
	 
	
	while(bool)
	{
		transaction();
	}
    scanner.close();
	 
	 
	
}

private static void transaction()
{
	System.out.println("SELECT OPTION "+"\n1.DEPOSITE "+"\n2.WITHDRAW  "+"\n3.CHECK BALANCE ");
	scanner=new Scanner(System.in);
	int choice=scanner.nextInt();
	int amount=0;
	switch(choice)
	{
	case 1:
		Account accountDeposite=Account.getaccount();
		System.out.println("Enter amount to deposite");
		amount=scanner.nextInt();
		Deposite deposite=new Deposite(accountDeposite,amount);
		deposite.deposite();
		break;
	case 2:
		Account accountWithdraw=Account.getaccount();
		System.out.println("Enter amount to withdraw");
		amount=scanner.nextInt();
		Withdraw withdraw=new Withdraw(accountWithdraw,amount);
		withdraw.withdraw();
		break;
	case 3:
		Account accountCheckBalance=Account.getaccount();
		checkBalance checkBal=new checkBalance(accountCheckBalance);
		checkBal.checkbalance();
		break;
	}
	 
	
}
}
