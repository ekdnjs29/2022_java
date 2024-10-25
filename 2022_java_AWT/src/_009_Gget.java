import java.util.Scanner;

abstract class Sprite {
	int x=3, y=3;
	abstract void move(char c);
}

class Main extends Sprite {
	void move(char c) {
		if( c == 'h' ) --y;
		else if( c == 'j' ) --x;
		else if( c == 'k' ) ++x;
		else if( c == 'l' ) ++y;
	}
}

class Monster extends Sprite {
	public Monster() {
		x = y = 7;
	}
	void move(char c) {
		x += (Math.random() - 0.5)>0? 1: -1;
		y += (Math.random() - 0.5)>0? 1: -1;
	}
}

public class _009_Gget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] field = new String[10][19];
		
		int r = (int)(Math.random()*100);
		field[r%7+1][r%16+1] = "G";
		
		Main user = new Main();
		field[user.x][user.y] = "@";
		
		Monster monster = new Monster();
		field[monster.x][monster.y] = "M";
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<19; j++) {
				field[i][0] = "#";
				field[i][18] = "#";
				field[0][j] = "#";
				field[9][j] = "#";
				if (field[i][j] == null)
					field[i][j] = " ";
				System.out.print(field[i][j]);
				}
			System.out.println();
			}
		
		while(true) {
			System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l): ");
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			char c = s.charAt(0);
			
			field[user.x][user.y] = " ";
			user.move(c);
			field[user.x][user.y] = "@";
			
			field[monster.x][monster.y] = " ";
			monster.move(c);
			if (field[r%7+1][r%16+1] == field[monster.x][monster.y]) {
				monster.move(c);
				field[monster.x][monster.y] = "M";
				}
			else field[monster.x][monster.y] = "M";
			
			for(int i=0; i<10; i++) {
				for(int j=0; j<19; j++) {
					field[i][0] = "#";
					field[i][18] = "#";
					field[0][j] = "#";
					field[9][j] = "#";
					if (field[i][j] == null)
						field[i][j] = " ";
					System.out.print(field[i][j]);
					}
				System.out.println();
				}
			
			if(field[user.x][user.y] == field[monster.x][monster.y]) {
				System.out.println("게임 오버");
				break;
				}
			
			if(field[user.x][user.y] == field[r%7+1][r%16+1]) {
				System.out.println("황금 획득!");
				break;
				}
		}
		
	}

}
