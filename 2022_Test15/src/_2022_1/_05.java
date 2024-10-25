package _2022_1;

import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("출력 항 입력: ");
		int n = sc.nextInt();
		int a = 0, b = 0, c = 1;
		
		for(int i=0; i<n; i++) {
			a = b;
			b = c;
			c = a+b;
			
			System.out.print(a + " ");
		}
	}

}
