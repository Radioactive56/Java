import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age :");
		int age = s.nextInt();
		String result=(age >= 18)?"you are eligible":"You are not eligible";
		System.out.println(result);
	}

}
