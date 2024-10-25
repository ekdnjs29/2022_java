// 입력 예외 처리

public class _08_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = Integer.parseInt("ABC"); // 문자열을 정수로 변경
			System.out.println(num);
		}
		catch (NumberFormatException e) {
			System.out.println("NumberFormat 예외 발생");
		}
	}

}
