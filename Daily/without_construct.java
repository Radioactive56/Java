package executor;

import java.util.Scanner;

public class without_construct {
	int rollno;
	String name;
	without_construct(int r,String n){
		rollno=r;
		name=n;
	}
	without_construct(){
		
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
		without_construct c = new without_construct(a,b);
		without_construct t = new without_construct();
		t.name=c.name;
		t.rollno=c.rollno;
		c.disp();
		t.disp();
	}

}
