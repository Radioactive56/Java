//WAP to apply static with variable.
package executor;

public class static_var {
	int rollno;
	String name;
	static String college="SFIT";
	static void college() {
		college="MIT";
	}
	void disp(String n,int r) {
		name=n;
		rollno=r;
		System.out.println("Name is :"+name+" rollno is :"+rollno+" college is :"+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static_var t =new static_var();
		static_var t1 =new static_var();
		static_var t2 =new static_var();
		static_var t3 =new static_var();
		static_var.college();//class.method can only used for static cause static belongs to class and not object
//Here the value of college is changed from sfit to mit and will be shown everytime the object is called
		t.disp("Manav",35);
		t1.disp("Man",15);
		t2.disp("M",325);
		t3.disp("Mad",5);
//In static once the value is changed it will be reflected everytime the new object is called.
// static invokes the body of the class without creating a object.
	}

}
