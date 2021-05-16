package seleniumtraining;

import java.util.Random;

public class BankAccount {
	
	private String accNumber;
	private double balnace;
	
	BankAccount(double intailAmount){
		Random rd=new Random();
		this.accNumber="XYZ01"+rd.ints(10001, 100000);
		this.balnace=intailAmount;
	}
	
     public void deposit(double amount) {
    	 this.balnace=balnace+amount;
    	 System.out.println("amount deposited sucessfully");
     }
     

     public void withDraw(double amount) {
    	 this.balnace=balnace-amount;
    	 System.out.println("amount withdrawn sucessfully");
     }


     public void showBalance() {
    	    	 System.out.println("available balance="+balnace);
     }

     
}
