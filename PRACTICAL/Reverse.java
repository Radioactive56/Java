package executor;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int p;
		int sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("The entered number is :"+num);
		while (num!=0) {
			p=num%10;
			sum=(sum*10)+p;
			num=(num/10);
		}
		System.out.println("The reversed number is :"+sum);
		

	}

}
