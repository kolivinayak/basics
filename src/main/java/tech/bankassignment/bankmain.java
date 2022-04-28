package tech.bankassignment;

import java.util.Scanner;

public class bankmain {

	
	static Scanner sc = new Scanner(System.in);
	static int choice;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input in = new Input();
		
		choice = display_choice();
		
		AccountDetails new_acc = null;
		AccountDetails ad=null;
		DepositCash dc = new DepositCash();
		WithdrawCash wc = new WithdrawCash();
		DisplayAccountDetails da = new DisplayAccountDetails();
		
		while (choice != 6 ) 
		{
			switch(choice) {
			case 0: 
			
					new_acc = in.create_acc ();
					choice = display_choice();
					break;
					
			case 1: 
					if (new_acc != null) 
						ad = dc.deposit_cash(new_acc);
					
					choice = display_choice();
					break;
				
			case 2: 
					if (new_acc != null) 
						ad = wc.cash_withdraw(new_acc);
					
					choice = display_choice();
					break;
			
			case 3: 
					if (new_acc != null)
						da.display_acc_balance(new_acc);
					
					choice = display_choice();
					break;
			case 4: 
					if (new_acc != null)
						da.display_acc_details(new_acc);	
					
					choice = display_choice();
						break;
			case 5: 
					if (new_acc != null)
						new_acc = in.update_nominee(new_acc);
					
					choice = display_choice();
					break;
			default:
					System.out.println("Please enter valid choice or 6 for exit program");
					choice = display_choice();
			}
		}
		System.out.println("Exiting program... good bye...!");
		
	}
	
	static int display_choice() {
		
		System.out.println("BANK UTILITY");
		
		System.out.println("Enter one of the below choice for bank operation"); 
		
		System.out.println(" 0. To Open account " + "\t\t" + " 1. Desposit Cash " + "\t\t\t" + " 2. Withdraw Cash ");
		System.out.println(" 3. Check Balance" + "\t\t" + " 4. Display Account details " + "\t\t" + " 5. Declare current nominee");
		System.out.println(" 6. Exit");
		System.out.println();
		
		int c = sc.nextInt();
		
		return c;
		
		
	}
}
