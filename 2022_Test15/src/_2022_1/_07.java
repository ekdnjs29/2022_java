package _2022_1;

class Car {
	String color; // 색상 
	int speed; // 속도 
	int gear; // 기어 
	
	public String toString() {
		return "Car [color= "+color+", speed= "+speed+", gear= "+gear+"]"; 
	}
	void changeGear(int g) {
		gear = g;
	}
	void speedUp() {
		speed += 10;
	}
	void speedDown() {
		speed -= 10;
	}
}
public class _07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.changeGear(1);
		myCar.speedUp();
		System.out.println(myCar);
	}

}
