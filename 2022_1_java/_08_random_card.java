
public class _08_random_card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		for(int i = 0; i < 5; i++) {
			int n = (int)(Math.random()*100);
			System.out.println(suit[n%4] + "의 " + num[n%13]);
		}
	}

}
