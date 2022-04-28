package tech.bankassignment;

import java.util.Scanner;

public class WithdrawCash {
	Scanner sc = new Scanner (System.in);
	
	AccountDetails cash_withdraw(AccountDetails ad) {
		
		System.out.println("Enter cash amount to be withdrown from account");
		int amount = sc.nextInt();
		ad.acc_balance = ad.acc_balance - amount; 
		return ad;
	}

}
