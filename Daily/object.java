package executor;

class Test{
	Test(object a){
		System.out.println("The value is : "+a.a);
	}
}

public class object {
	int a=69;
	object(){
		Test c = new Test(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		object a = new object();
		
	}

}
