import java.util.Scanner;

public class _09_random_number_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int guess = (int)(Math.random()*100);
		int n = 0;

		while (true) {
			System.out.print("정답을 추측하여 보시오: ");
			int answer = sc.nextInt();
			if (guess < answer) {
				System.out.println("제시한 정수가 낮습니다.");
				n++;}
			if (guess > answer) {
				System.out.println("제시한 정수가 높습니다.");
				n++;}
			if (guess == answer) {
				System.out.println("축하합니다. 시도횟수 = "+n);
				break;}
		}
	}

}
