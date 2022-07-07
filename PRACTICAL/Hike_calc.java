package executor;

import java.util.Scanner;

class Employee{
	int salary;
	String empname="Manav";
}
class Parent extends Employee{
	void show() {
		System.out.println("Employee name is :"+empname);
	}
	void permanent(int salary) {
		double hike=0.05;
		double total=salary+(salary*hike);
		System.out.println("The new salary of permanent employee is :"+total);
	}
}
class Child extends Employee{
	void show() {
		System.out.println("Employee name is :"+empname);
	}
	void temp(int salary) {
		double hike=0.03;
		double total=salary+(salary*hike);
		System.out.println("The new salary of temporary employee is :"+total);
	}
	
}
public class Hike_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary");
		int a = sc.nextInt();
		Child v = new Child();
		v.show();
		v.temp(a);
		Parent t = new Parent();
		t.permanent(a);
		

	}

}
