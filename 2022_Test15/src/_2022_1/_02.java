package _2022_1;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		
		System.out.println();
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--)
				System.out.print(" ");
			for(int k=0; k<=i; k++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		for(int i=0; i<=5; i++) {
			for(int j=0; j<5-i; j++)
				System.out.print(" ");
			for(int k=1; k<=i*2-1; k++)
				System.out.print("*");
			System.out.println();
		}
	}

}
