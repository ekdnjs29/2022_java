
public class _005_pythagoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		for (a = 1; a <= 100; a ++) 
			for (b = 1; b <= 100; b++) 
				for (c = 1; c <= 100; c++)
					if (a*a + b*b == c*c)
						System.out.println(a+"\t"+b+"\t"+c);

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--)
				System.out.print(" ");
			for (int k = 0; k < i; k++)
				System.out.print("*");
			System.out.println();
		}
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < 5 - i; j++)
				System.out.print(" ");
			for (int k = 0; k < 2*i-1; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
