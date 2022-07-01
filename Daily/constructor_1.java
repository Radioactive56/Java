package executor;

public class constructor_1 {
	int a;
	constructor_1(){
		System.out.println("Default constructor.....");
	}
	constructor_1(int a){
		this();
		this.a=a;
		System.out.println("Parameter constructor value is :"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor_1 t = new constructor_1(34);
	}

}
