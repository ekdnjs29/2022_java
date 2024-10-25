
public class _02_Ragged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = { {10,11,12},
				  {20,21},
				  {30,31,32,33} };
		for(int i = 0; i<array.length; i++) {
			for(int j: array[i])
				System.out.print(j + " ");
			System.out.println();
		}
	}

}
