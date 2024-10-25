class Circle{
	int r;
	public Circle(int r) {
		this.r = r;
	}
	
}
public class _11_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle [] c = new Circle[3];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle((int)(Math.random()*100));
			System.out.println("Circle [radius=" + c[i].r + "]");
		}
	}
	
}