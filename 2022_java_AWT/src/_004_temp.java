import java.util.Scanner;

public class _004_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("====================");
		System.out.println("1. 화씨 -> 섭씨 ");
		System.out.println("2. 섭씨 -> 화씨 ");
		System.out.println("====================");

		System.out.print("번호를 선택하시오. ");
		int n = sc.nextInt();

		if (n == 1) {
			System.out.print("화씨온도를 입력하세요: ");
			double f = sc.nextDouble();
			double c_temp = 5./9 * (f-32);

			System.out.println("섭씨온도는 " + c_temp);
		}

		else {
			System.out.print("섭씨온도를 입력하세요: ");
			double c = sc.nextDouble();
			double f_temp = c * 9./5 + 32;

			System.out.println("화씨온도는 " + f_temp);
		}
	}

}
