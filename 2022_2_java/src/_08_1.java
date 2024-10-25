
// 0으로 나누는 예외 처리

public class _08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = 10 / 0; // 예외 발생
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램은 계속 진행");
	}

}
