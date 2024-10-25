import java.util.ArrayList;

public class _13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		// add(): 생성된 ArrayList 객체에 데이터 저장
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
//		
//		for (String s: list)
//			System.out.print(s+" ");
//		System.out.println();
		
		// 기존의 데이터가 들어있는 위치를 지정하여 add()를 호출하연 중간에 삽입
		list.add(1, "APPLE"); 
//		
//		for (String s: list)
//			System.out.print(s+" ");
//		System.out.println();
//		
		// set(): 특정 위치에 있는 원소를 바꿔주는 메소드 
		list.set(2, "ORANGE"); // 인덱스 2의 원소를 "ORANGE"로 대체
		
//		for (String s: list)
//			System.out.print(s+" ");
//		System.out.println();
		
		// remove(): 데이터 삭제
		list.remove(3); // 인덱스 3의 원소 삭제
		
//		for (String s: list)
//			System.out.print(s+" ");
//		System.out.println();
		
		// get(): 저장된 객체를 가져오는 메소드 
		String s = list.get(1);
		
//		System.out.print(s);
		
		int index = list.indexOf("MILK");
		
//		System.out.print(index);
	}

}