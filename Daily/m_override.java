//Method overriding example
package executor;

class Parent {
	void show() {
		System.out.println("Parent class executed....");
	}
}
class Child extends Parent{
	void show() {
		System.out.println("Child class executed....");
	}
}
public class m_override {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.show();
	}

}
