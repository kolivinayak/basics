package tech.bankassignment;

public class DisplayAccountDetails {

	void display_acc_details (AccountDetails ad)
	{
		System.out.println(" Account No :" + ad.acc_no + "\t"+ "Account Name : " + ad.acc_name + "\t" + "Nominee Name : "+ ad.acc_nominee + "\t"+"Account Balance :" + ad.acc_balance);
		System.out.println();
	}
	
	void display_acc_balance (AccountDetails ad){
		System.out.println("The Balance in account is : " + ad.acc_balance);
		System.out.println();
	}
}
