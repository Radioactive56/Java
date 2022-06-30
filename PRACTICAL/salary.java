package executor;

public class salary {
	int it,da,ta,hra,base,gs;
	salary(int b){
		base=b;
		hra=(b*10)/100;
		it=(b*5)/100;
		da=(b*15)/100;
		ta=(b*8)/100;
		gs=base+hra+da+ta-it;
	}
	void dis() {
		System.out.println("The gross salary is :"+gs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salary a= new salary(10000);
		a.dis();

	}

}
