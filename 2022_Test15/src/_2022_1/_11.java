package _2022_1;

class Circle2 {
	protected int radius;
	public Circle2(int r) {
		radius = r;
	}
}

class Pizza extends Circle2 {
	String name;
	
	public Pizza(String name, int r) {
		super(r);
		this.name = name;
	}
	
	void print() {
		System.out.println("피자의 종류: "+name+", 피자의 크기: "+radius);
	}
}
public class _11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza obj = new Pizza("Pepperoni", 20);
		obj.print();
	}

}
