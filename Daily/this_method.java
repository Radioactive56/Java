package executor;

public class this_method {
	void disp(this_method t) {
		System.out.println("hey....");
	}
	void calc() {
		this.disp(this);
	}
	
	public static void main(String[] args) {
		this_method t = new this_method();
		t.calc();
	}
}
