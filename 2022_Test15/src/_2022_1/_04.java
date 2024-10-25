package _2022_1;

import java.util.Arrays;

public class _04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] rarray1 = new int[3][];
		
		rarray1[0] = new int[] {1,2,3,4};
		rarray1[1] = new int[] {5,6,7};
		rarray1[2] = new int[] {8,9};
		
		//foreach
		for(int[]i: rarray1) {
			System.out.println(Arrays.toString(i));
		}
		
		int[][] rarray2 = { {1,2,3,4},{5,6,7},{8,9} };
		
		for(int i=0; i<=rarray2.length; i++) {
			for(int j: rarray2[i])
				System.out.print(j + " ");
			System.out.println();
		}
	}

}
