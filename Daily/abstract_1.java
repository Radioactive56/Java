package executor;

import java.util.Scanner;

abstract class Parent {
	 abstract void fun();
	 void show() {
		 System.out.println("Heyy");
	 }
}
class Child extends Parent{
	Scanner sc = new Scanner(System.in);
	@Override
	void fun() {
		
		// TODO Auto-generated method stub
		System.out.println("Enter a number :");
		int t = sc.nextInt();
		String max = t>=18?"Eligible for voting":"Not eligible for voting";
		System.out.println("the result is : "+max);
	}
}
class abstract_1{
	public static void main(String[] a) {
		Parent t = new Child();
		t.show();
		t.fun();
	
}
}

