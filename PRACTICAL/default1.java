package executor;

import java.util.Scanner;

public class default1 {
	int rollno;
	String name;
	default1(int r,String name) {
		rollno=r;
		this.name=name;
	}
	void disp() {
		System.out.println("Your name is : "+name);
		System.out.println("Your roll no is : "+rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a roll no: ");
		int c=sc.nextInt();
		System.out.println("Enter a name: ");
		String n =sc.next();
		default1 t= new default1(c,n);
		t.disp();
	}

}
