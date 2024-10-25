// FlowLayout

import java.awt.*;
import javax.swing.*;

public class _09_1 extends JFrame {
	public _09_1() {
		setLayout(new FlowLayout());
		
		add(new JButton("btn1"));
		add(new JButton("btn2"));
		add(new JButton("btn3"));
		add(new JButton("btn4"));
		add(new JButton("btn5"));
		
		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_09_1 f = new _09_1();
	}

}
