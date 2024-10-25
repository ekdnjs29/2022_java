
public class _13_1 {
	public static <T> void printArray(T[] array) {
		for (T i: array) 
			System.out.print(i + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] iArray = { 10,20,30,40,50 };
		Double[] dArray = { 1.1,1.2,1.3,1.4,1.5 };
		Character[] cArray = { 'd','a','w','o','n' };
		
		printArray(iArray);
		printArray(dArray);
		printArray(cArray);
	}

}
