package _2022_1;

class Rectangle {
	int width, height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
}
class ColorRectangle extends Rectangle {
	String color;
	
	public ColorRectangle (int w, int h, String color) {
		super(w,h);
		this.color = color;
	}
}
public class _14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorRectangle obj = new ColorRectangle(100,100,"blue");
		System.out.println("가로: "+obj.width);
		System.out.println("세로: "+obj.height);
		System.out.println("색상: "+obj.color);
	}

}
