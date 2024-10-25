import java.util.Scanner;

public class _05_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("소문자 알파벳 하나를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = s.charAt(0);
		
		for(char i='a'; i<=c;) {
			for(char j='a';j<=c;j++)
				System.out.print(j);
			System.out.println();
			c = (char)(c-1);
		}
			
	}

}
