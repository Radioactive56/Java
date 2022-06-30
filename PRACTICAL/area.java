package executor;

public class area {
	int length;
	int width;
	int mul;
	
	void takedata(int l,int w) {
		length=l;
		width=w;
		mul= w*l;
	}
	void dis() {
		System.out.println("Area is :"+mul);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		area t= new area();
		t.takedata(20, 30);
		t.dis();
	}

}
