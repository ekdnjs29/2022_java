package _2022_1;

class Shape {
	protected int x, y;
}
interface Drawable{
	void draw();
}
class Circle_ extends Shape implements Drawable {
	int radius;
	public void draw() {
		System.out.println("Circle Draw at ("+x+", "+y+")");
	}
}
public class _15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable obj = new Circle_();
		obj.draw();
	}

}
