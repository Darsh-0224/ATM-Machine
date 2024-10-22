package darsh;
import java.util.*;


public class ATMmachine {
	
	static int	password = 2027;
	static float balance = 10000;
	Scanner sc = new Scanner(System.in);
	
	
	public void checkpin() {
		
		
		System.out.println("Enter Your pin");
		int pin = sc.nextInt();
		
				if(pin == password) {
					
					this.Menu();
				}
				else {
					System.out.println("Wrong PIN entered");
					
					
					this.checkpin();
				}
	}
	
	public void Menu() {
		System.out.println("What you want to do");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 for Checking your balance");
		System.out.println("Press 2 for Withdrawing your money");
		System.out.println("Press 3 for Depositing your money");
		System.out.println("Press 4 to exit");
		
		
		
		int num = sc.nextInt();
		
		switch (num) {
		
		case 1 : this.checkbalance();
		break;
		
		case 2 : this.withdraw();
		break;
		
		case 3 : this.Deposit();
		break;
		
		case 4 : this.Exit();
		break;
		}
		
	}
	
	public void checkbalance() {
	System.out.println("The Balance in your Account is " + balance);
	this.Menu();
	}
	
	public void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		Float amount = sc.nextFloat();
		
		if (amount > balance){
			System.out.println("Insufficient balance");
		}
		else{
			balance = balance - amount;
			System.out.println("Amount Withdrawn Sucessfully");
			
			
			this.Menu();
		}
	}
	
	public void Deposit() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount to Deposit");
		
		Float deposit = sc.nextFloat();
		balance = balance + deposit;
		
		System.out.println("Amount Deposited Sucessfully");
		
		this.Menu();
		
		
	}
	
	public void Exit() {
		System.out.println("Thank You");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMmachine a = new ATMmachine();
		a.checkpin();
	}

}

