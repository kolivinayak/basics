package tech.bankassignment;

import java.util.Scanner;

public class DepositCash {

	Scanner sc = new Scanner (System.in);
	
	AccountDetails deposit_cash(AccountDetails ad) {
		
		System.out.println("Enter cash amount to be deposited : " + "\t");
		int amount = sc.nextInt();
		
		ad.acc_balance += amount;
		return ad;
	}
	
}
