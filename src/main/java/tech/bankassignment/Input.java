package tech.bankassignment;

import java.util.Scanner;

public class Input {

	Scanner sc = new Scanner(System.in);
	

	AccountDetails ad = new AccountDetails();
	
	AccountDetails create_acc () 
	{
		ad.acc_no = AccountDetails.next_availble_account_no;
		
		AccountDetails.next_availble_account_no++;
		
		System.out.println("Eneter name for new account " + ad.acc_no + " :" );
		ad.acc_name = sc.next();
		
		System.out.println("Eneter nominee name for new account " + ad.acc_no + " :" );
		ad.acc_nominee = sc.next();
		
		System.out.println("Eneter cash amount to be deposited for new account " + ad.acc_no + " :" );
		ad.acc_balance = sc.nextInt();
		
		return ad;
	
	}
	
	AccountDetails update_nominee(AccountDetails ad) {
		
		System.out.println("Enter the new nominee name to be updated on file ");
		String nominee = sc.next();
		
		ad.acc_nominee = nominee;
		return ad;
	}
	
}
