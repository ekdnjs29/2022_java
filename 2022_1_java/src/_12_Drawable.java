
public class _12_Drawable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new Duck();
		System.out.print("Duck은 ");
		duck.walk();
		duck.fly();
		duck.sing();
		duck.draw();
	}

}

interface Animal {
	void walk();
	void fly();
	void sing();
	}

interface Drawable {
	void draw();
}

class Duck implements Animal, Drawable {
	public void walk() {
		System.out.println("걸을 수 있음");
	}
	public void fly() {
		System.out.println("날 수 있음");
	}
	public void sing() {
		System.out.println("노래할 수 있음");
	}
	public void draw() {
		System.out.println("그릴 수 있음");
	}
}