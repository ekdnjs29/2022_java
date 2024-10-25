// BorderLayout

import java.awt.*;
import javax.swing.*;

public class _09_2 extends JFrame {
	public _09_2() {
		setLayout(new BorderLayout());
		
		JButton b1 = new JButton("북");
		JButton b2 = new JButton("남");
		JButton b3 = new JButton("동");
		JButton b4 = new JButton("서");
		JButton b5 = new JButton("중앙");
		
		add(b1, "North");
		add(b2, "South");
		add(b3, "East");
		add(b4, "West");
		add(b5, "Center");
		
		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_09_2 f = new _09_2();
	}

}
