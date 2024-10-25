// 배열 인덱스 예외 처리

public class _08_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5};
		int i = 0;
		
		try {
			for (i=0; i<=array.length; i++)
				System.out.print(array[i] + " ");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 " + i + "는 사용할 수 없습니다."); 
		}
	}

}
