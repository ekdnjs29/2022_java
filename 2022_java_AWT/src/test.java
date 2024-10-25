import java.awt.*;
import javax.swing.*;

public class test extends JFrame {
	public test() {
		setSize(300,150); // JFrame의 크기 설정 
		setLocation(200, 300); // JFrame의 위치 설정 
		setTitle("MyFrame");
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.orange); // 배경색 변경 
		
		JButton btn1 = new JButton("확인");
		JButton btn2 = new JButton("취소");
		
		this.add(btn1);
		this.add(btn2);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test f = new test();
	}

}
