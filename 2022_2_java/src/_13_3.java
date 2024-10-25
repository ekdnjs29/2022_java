import java.util.ArrayList;

class Point2 {
	int x, y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	public String toString() { return "("+x+", "+y+")"; }
}

public class _13_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Point2> list = new ArrayList<>();
		
		list.add(new Point2(0, 0));
		list.add(new Point2(3, 5));
		list.add(new Point2(-1, 4));
		
		System.out.println(list);
	}

}
