package executor;

import java.util.Scanner;
//implementing the method on the check class and created a scanner function
class Check implements Airline_Interface{
	Scanner sc = new Scanner(System.in);
	@Override
	public void Luggage() {
		// TODO Auto-generated method stub
		System.out.println("Enter the weight of the luggage : ");
		int l = sc.nextInt();
		if (l<=20) {
			System.out.println("Weight of the luggage is acceptable");
		}
		else {
			System.out.println("Weight of the luggage is not acceptable");
		}
	}
	
}

public class Airline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airline_Interface t = new Check();
		t.Luggage();

	}

}
