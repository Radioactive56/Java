package executor;

import java.util.Scanner;

class atm implements Bank{
	private static int main_balance=1000;
	int credit;
	int debit;
	public static int getMain_balance() {
		return main_balance;
	}

	public static void setMain_balance(int main_balance) {
		atm.main_balance = main_balance;
	}



	@Override
	public void withdraw(int debit) {
		// TODO Auto-generated method stub
		this.debit=debit;
		if (debit>main_balance) {
			System.out.println("Transcation not possible......");
		}
		else {
			main_balance=main_balance-debit;
			System.out.println("Transaction completed and the balance is : "+main_balance);
		}
		System.out.println("The available balance is : "+main_balance);
	}

	@Override
	public void deposit(int credit) {
		// TODO Auto-generated method stub
		this.credit=credit;
		main_balance=main_balance+credit;
		System.out.println("Transaction completed and the balance is : "+main_balance);
	}
	
}
public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the option : 1]Withdraw 2]Deposit 0]To Exit");
			int z= sc.nextInt();
			if (z==0) {
				break;
			}
			else if (z==1) {
				atm v =new atm();
				v.show();
				System.out.println("Enter the amount to withdraw....");
				int c = sc.nextInt();
				v.withdraw(c);
				
			}
			else if (z==2) {
				atm v =new atm();
				v.show();
				System.out.println("Enter the amount to deposit....");
				int c = sc.nextInt();
				v.deposit(c);
			}

	}

}
}