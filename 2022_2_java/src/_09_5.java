// 절대 위치 배치 

import java.awt.*;
import javax.swing.*;

public class _09_5 extends JFrame {
	private JButton b1, b2;
	
	public _09_5() {
		setLayout(null);
		
		b1 = new JButton("btn1");
		add(b1);
		b1.setLocation(50, 30);
		b1.setSize(90,50);
		
		b2 = new JButton("btn2");
		add(b2);
		b2.setBounds(180, 30, 90, 30);
		
		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_09_5 f = new _09_5();
	}

}
