package _2022_1;

class Circle {
	int radius; // 필드 
	
	public Circle(int radius) { // 매개변수 
		this.radius = radius; // 필드 = 매개변수 
		// this가  현재 객체 참조, this가 없다면 매개변수 = 매개변수
	}
	
	public Circle() {
		this(0); // 기본값 0
	}
	
	double getArea() {
		return 3.14*radius*radius;
	}
}

public class _06 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		System.out.println(c1.getArea());
		Circle c2 = new Circle(2);		
		System.out.println(c2.getArea());
	}
	
}

/* this 참조변수
 * : 현재 객체 자신을 가리키는 참조 변수, 컴파일러에서 자동으로 생성 (생성자에서 매개변수 이름과 필드 이름이 동일한 경우 혼동을 막기 위해 사용)
 * this()
 * : 다른 생성자 의미, 복잡한 생성자 작성 후 다른 생성자에서 복잡한 생성자를 호하는데 사용 
 * 주의 사항
 * 1. 생성자 안에서만 호출 가능 
 * 2. 반드시 첫 번째 문장 
 * 3. 다른 생성자를 호출할 때만 사용 
 */
 