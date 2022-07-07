package executor;

import java.util.Scanner;

abstract class fib_ab {
	abstract void fib();
	void show() {
		int f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int t = sc.nextInt();
		while (t>0) {
			f=f*t;
			t=t-1;
		}
		System.out.println("The factorial is : "+f);	
	}
}
