package executor;

public class test_this1 {
	int a=10;
	test_this1(){
		test_this t=new test_this(this);
		t.disp();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_this1 t1 = new test_this1();
	}

}
