import java.util.*;

public class _13_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>(); // 생성

		map.put("kim", "1"); // 저장
		map.put("park", "2");
		map.put("lee", "3");

		// 모든 요소 방문
		for (String key: map.keySet()) // for-each 구문과 keySet() 사용
			System.out.println( key + " : " +  map.get(key));

		Iterator<String> it = map.keySet().iterator(); // 반복자 사용 
		while (it.hasNext()) {
			String key = it.next();
			System.out.println( key + " : " +  map.get(key));
		}
		
		map.remove("lee"); // 항목 삭제
		System.out.println(map);
	}

}
