package executor;

class College{
	void show() {
		System.out.println("Welcome to SFIT.");
	}
}
class Student extends College{
	void show() {
		super.show();
		System.out.println("Student Name: Manav");
	}
}
class Teacher extends College{
	void show(){
		super.show();
		System.out.println("Teacher Name: Deadpool");
	}
}
class Department extends Student{
	void show() {
		super.show();
		System.out.println("Manav belongs to Accounts Department.");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department sc = new Department();
		Teacher v = new Teacher();
		sc.show();
		v.show();

	}

}
