
public class Swap1 {

	public static void main(String[] args) {
		int a=10 , b=20;
		a= a + b;
		b= a - b;
		a= a - b;
		System.out.println("After Swapping a is :" +a);
		System.out.println("After Swapping b is :" +b);
	}

}
