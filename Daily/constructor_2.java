package executor;

public class constructor_2 {
	int pid;
	String name;
	int age;
	constructor_2(int pid,String name){
		this.pid=pid;
		this.name=name;
	}
	constructor_2(int pid,String name,int age){
		this(pid,name);
		this.age=age;
	}
	void disp() {
		System.out.println("Your name is : "+name+" Your age is: "+age+" your pid is : "+pid);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor_2 t = new constructor_2(10000,"Manav");
		constructor_2 t1 = new constructor_2(11000,"Man",12);
		t.disp();
		t1.disp();
	}

}
