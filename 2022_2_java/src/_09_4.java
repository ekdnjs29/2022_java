// CardLayout

import java.awt.*;
import javax.swing.*;

public class _09_4 extends JFrame {
	JButton b1, b2, b3;
	Container cPane;
	CardLayout layoutm;
	
	public _09_4() {
		cPane = getContentPane();
		layoutm = new CardLayout();
		setLayout(layoutm);
		
		JButton b1 = new JButton("Card #1");
		JButton b2 = new JButton("Card #2");
		JButton b3 = new JButton("Card #3");
		
		add(b1);
		add(b2);
		add(b3);
		
		// 람다식 사용 
		b1.addActionListener(e->layoutm.next(cPane));
		b2.addActionListener(e->layoutm.next(cPane));
		b3.addActionListener(e->layoutm.next(cPane));
		
		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_09_4 f = new _09_4();
	}

}
