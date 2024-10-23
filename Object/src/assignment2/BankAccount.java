package assignment2;

public class BankAccount {
	
     int AccountBalance = 0;
	
	
	 public void deposit( int amount) {
		 
		AccountBalance=  AccountBalance + amount;
	 	System.out.println("Deposit :" +AccountBalance );
		
	}
	
	  public void withdrawal(int amount) {
		
	    AccountBalance = AccountBalance - amount;
		System.out.println("Withdrawal :" +amount);
		System.out.println("AccountBalance :"+AccountBalance);
		
		
	}
	
	 
	public static void main(String[] args) {
		
		BankAccount B = new BankAccount();
		B.deposit(500);
		
		BankAccount B1 = new BankAccount();
		B.withdrawal(100);
		
	   

	}

}
