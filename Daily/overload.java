package executor;

public class overload {
	int rollno;
	String name;
	overload(){
		System.out.println("This is a default constructor hence we need to create a new object to show it,when we also have parameterized constructor");
	}
	overload(int r){
		rollno=r;
		
	}
	overload(String name){
		this.name=name;
		
	}
	overload(int r,String name){
		rollno=r;
		this.name=name;
	}
	
	void disp() {
		System.out.println("Name is : "+name);
		System.out.println("Roll no. is : "+rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload d = new overload();
		overload m = new overload("Raj");
		overload t = new overload(35,"Manav");
		m.disp();
		t.disp();

	}

}
