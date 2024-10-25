class Point{
	private int x,y;
	public Point(int x, int y) { 
		this.x = x; this.y = y; 
		}
	public int getX() {
		return x;
		}
	public int getY() {
		return y;
		}
	protected void move(int x, int y) {
		this.x = x; this.y = y;
		}
}

class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y); //상속관계에서 부모 클래스의 메소드나 필드를 명시적으로 참조하기 위해 사용
		this.color = color;
	}
	public void myColorPoint() {
		System.out.println(color + "(" + getX() +","+ getY() + ")");
	}
	
}
public class _06_Point_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint mycolor = new ColorPoint(1,2,"Red");
		mycolor.myColorPoint();
	}

}
