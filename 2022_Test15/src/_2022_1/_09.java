package _2022_1;

class MyMath {
	public static int abs(int x) {
		return x>0 ? x:-x;
	}
	public static int power(int base, int exponent) {
		int result = 1;
		for (int i=1; i<=exponent; i++)
			result *= base;
		return result;
	}
}
public class _09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10의 3승은 "+MyMath.power(10,3));
	}

}

/* 정적 변수 (static 변수)
 * : 클래스당 하나만 생성되는 변수 
 *   동일한 클래스로 생성된 모든 객체는 하나의 정적 변수 공유
 *   객체 없이도 사용 가능 (클래스 이름. 변수)
 * 정적 메소드 (static 메소드)
 * : 객체를 생성하지 않아도 메소드 호출 가능 (main() 메소드도 정적 메소드이기 때문에 객체 생성 없이 사용 가능)
 *   정적 메소드는 정적 멤버만 사용 가능 (인스턴스 메소드 X, 정적 메소드에서 정적 메소드를 호출하는 것은 가능)
 *   this 사용 불가 (this: 현재 객체를 가리키는 참조 변수 -> 정적 메소드는 객체가 없을 때도 호출 가능하기 때문에 현제 객체라는 개념 X)  */
 