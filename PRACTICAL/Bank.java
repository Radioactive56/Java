package executor;

public interface Bank {
	void withdraw(int credit);
	void deposit(int debit);
	default void show() {
		String name="Manav";
		int acc=134598123;
		System.out.println("Your name is : "+name+" and your account number is : "+acc);
	}
}
