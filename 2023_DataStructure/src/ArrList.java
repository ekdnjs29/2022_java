import java.util.*;

public class ArrList <E> {
	public static void f(int n) {
		if (n >1) {
			f(n/2);
			f(n/2);
		}
		System.out.print("* ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(9);
	}
}
