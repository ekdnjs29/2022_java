package _2022_1;

class Animal {
	void speak() {
		System.out.println("Animal 클래스의 sound()");
	}
	void walk() {
		System.out.println("걸을 수 있음");
	}
}
class Dog extends Animal {
	void speak() {
		System.out.println("멍멍");
	}
}
class Cat extends Animal {
	void speak() {
		System.out.println("야옹");
	}
}
class Bird extends Animal {
	void fly() {
		System.out.println("날 수 있음");
	}
	void sing() {
		System.out.println("노래  수 있음");
	}
}
public class _12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		a1.speak();
		a2.speak();
		
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
