package executor;

public class static_num {
	int a=1;
	static_num(){
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static_num t = new static_num();
		static_num t1 = new static_num();
		static_num t2 = new static_num();
	}

}
//// static invokes the body of the class without creating a object.
//Here when we don't add static we can see that the values of all objects t,t1,t2 is same i.e 2;
//but when we add static static the value of t becomes 2,t1=3,t2=4;
//this is because static variable changes the value of variable in class cause static belongs to class not object
//and when the new object is called
//it picks up the new static class value and implements on it.