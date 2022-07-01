package executor;
class Parent1{
	private void show() {
		System.out.println("Parent class executed....");
	}
}
class Child1 extends Parent1{
	protected void show() {
		System.out.println("Child class executed....");
	}
}
public class access_m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 v = new Child1();
		v.show();
	}

}
