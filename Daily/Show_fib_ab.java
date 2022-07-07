package executor;

import java.util.Scanner;

class Child extends fib_ab{

	@Override
	void fib() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int d = sc.nextInt();
		String max=d>=18?"You are eligible":"You are not eligible";
		System.out.println("The result is : "+max);
		
	}
	
}

public class Show_fib_ab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib_ab f = new Child();
		f.fib();
		f.show();

	}

}
