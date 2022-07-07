package executor;
abstract class Shape{
	abstract void area();
}
class Circle extends Shape{
	int r;

	Circle(int r){
		this.r=r;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("The area of circle is : "+(3.14*r*r));
	}
	
}
class Square extends Shape{
	int l,b;
	Square(int l,int b){
		this.l=l;
		this.b=b;
	}
	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("The area of the rectangle is : "+(l*b));
		
	}
}
public class Tests {

	public static void main(String[] args) {
		Square c = new Square(12,32);
		Circle m = new Circle(45);
		c.area();
		m.area();
	}

}
