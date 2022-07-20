package executor;

import java.util.Scanner;

class Parent implements Bank{
	private static int main_balance=1000;
	int debit;
	private int acc_num;
	int credit;

	public int getAcc_num() {
		return acc_num;
	}

	public void setAcc_num(int acc_num) {
		this.acc_num = acc_num;
	}
	public int getMain_balance() {
		return main_balance;
	}

	@Override
	public void Deposit(int credit) {
		// TODO Auto-generated method stub
		this.credit=credit;
		System.out.println("The amount deposited in the account is : "+(main_balance+credit));
		
	}
	
	@Override
	public void Withdraw(int debit) {
		// TODO Auto-generated method stub
		this.debit=debit;
		int c = main_balance-debit;
		if (debit>main_balance) {
			System.out.println("Not Enough Balance.......");
		}
		else {
			System.out.println("Rupees "+debit+" is debited and the remaining balance is : "+(c));
		}
		
	}

	public static void setMain_balance(int main_balance) {
		Parent.main_balance = main_balance;
	}

}

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the option : 1]Withdraw 2]Deposit");
			int z= sc.nextInt();
			if (z==1) {
				Parent v = new Parent();
				v.show();
				System.out.println("Enter the acc_number");
				int a = sc.nextInt();
				v.setAcc_num(a);
				System.out.println("Enter the amount to withdraw : ");
				int d = sc.nextInt();
				System.out.println("Your account number is : "+v.getAcc_num());
				v.Withdraw(d);
			}
			if (z==2){
				Parent v = new Parent();
				v.show();
				Scanner t = new Scanner(System.in);
				System.out.println("Enter the acc_number");
				int a = t.nextInt();
				v.setAcc_num(a);
				System.out.println("Your account number is : "+v.getAcc_num());
				System.out.println("Enter the amount to deposit : ");
				int d = t.nextInt();
				v.Deposit(d);
				v.show();
				System.out.println("Your account number is : "+v.getAcc_num());
				
			}

		}
		}
}

