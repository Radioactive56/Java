package executor;

import java.util.Scanner;

class Child2 implements Average_Interface{
	@Override
	public void calc(int m1,int m2,int m3,int m4,int m5) {
		// TODO Auto-generated method stub
		int denom = 5;
		int avg= ((m1+m2+m3+m4+m5)/denom);
		System.out.println("The average of all marks is :"+avg);
		
	}
	
}
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("Enter your 1st subject marks : ");
		int m1 = sc.nextInt();
		System.out.println("Enter your 2nd subject marks : ");
		int m2 = sc.nextInt();
		System.out.println("Enter your 3rd subject marks : ");
		int m3 = sc.nextInt();
		System.out.println("Enter your 4th subject marks : ");
		int m4 = sc.nextInt();
		System.out.println("Enter your 5th subject marks : ");
		int m5 = sc.nextInt();
		Average_Interface v =new Child2();
		v.calc(m1, m2, m3, m4, m5);

	}

}
