//WAP to copy the value of one object into another using constructor.
package executor;

import java.util.Scanner;

public class Copy_construct {
	int rollno;
	String name;
	Copy_construct(int r,String n){
		rollno=r;
		name=n;
	}
	Copy_construct(Copy_construct c){
		rollno=c.rollno;
		name=c.name;
	}
	void disp() {
		System.out.println("Name is "+name);
		System.out.println("Rollno is "+rollno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name ");
		String b=sc.nextLine();
		System.out.println("Enter Roll no. ");
		int a=sc.nextInt();
		Copy_construct c = new Copy_construct(a,b);
		Copy_construct t = new Copy_construct(c);
		c.disp();
		t.disp();
	}

}
