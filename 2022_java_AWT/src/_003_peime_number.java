
public class _003_peime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		System.out.print("2부터 100사이의 모든 소수: ");
		for (i = 2; i <= 100; i++) {
			for (j = 2; j < i; j++) {
				if (i%j == 0)
					break;
			}
			if (i == j)
				System.out.print(i + " "); 
		}
	}

}
