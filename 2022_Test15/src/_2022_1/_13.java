package _2022_1;

class Sports {
	String getName() {
		return "아직 결정되지 않음";
	}
	int getPlayers() {
		return 0;
	}
}

class Soccer extends Sports {
	String getName() {
		return "축구";
	}
	int getPlayers() {
		return 11;
	}
}
public class _13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soccer soccer = new Soccer();
		System.out.println("경기이름: "+soccer.getName());
		System.out.println("경기자 수: "+soccer.getPlayers());
	}

}
