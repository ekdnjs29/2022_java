import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _025_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("USA", "Washington");
		map.put("Japan", "Tokyo");
		map.put("China", "Beijing");
		map.put("UK", "London");
		map.put("Korea", "Seoul");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국가의 이름을 입력하시오: ");
		String s = sc.nextLine();
		
		System.out.println(s + "의 수도: " + map.get(s));
	}

}
