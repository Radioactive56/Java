package exception_handling;

import java.util.Scanner;
public class Task_2 {
	int age;
	void check(int age) {
		this.age=age;
		try {
			if (age<18) {
				throw new AgeException("Age less than 18.");
			}
			else {
				System.out.println("Your age is : "+age);
			}
		}catch(AgeException e) {
			System.out.println("This is an exception "+e);
		}
	}
	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Task_2 v = new Task_2();
		System.out.println("Enter the age : ");
		int p = sc.nextInt();
		v.check(p);
	}

}
