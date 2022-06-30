package executor;

import java.util.Scanner;

public class Bike {
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bike number : ");
		String bno = sc.nextLine();
		System.out.println("Enter the customer name : ");
		String name = sc.nextLine();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rent days : ");
		int t = s.nextInt();
		int sum=0;
		if (t <= 5) {
			  sum=sum+(t*500);			
		}
		else if ( t <= 10) {
			sum=sum+((t-5)*400)+2500;
		}
		else if (t>10) {
			sum=sum+4500+((t-10)*200);
		}
		System.out.println("Name is "+name+" bike number is :"+bno+" Rent fees is :"+sum);
	}
	
	public static void main(String[] args) {
		Bike m = new Bike();
		m.input();
		
	}

}
