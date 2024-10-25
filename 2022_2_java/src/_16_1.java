// Thread를 상속받아서 클래스를 작성
class MyThread extends Thread {
	public void run() { // run() 메소드 재정의 
		for (int i=0; i<=10; i++)
			System.out.print(i + " ");
	}
}

public class _16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new MyThread(); // Thread 객체 생성
		t.start(); // start()를 호출해 스레드 시작 
	}

}
