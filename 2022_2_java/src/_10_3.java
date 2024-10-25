// 버튼 움직이기

import java.awt.event.*;
import javax.swing.*;

public class _10_3 extends JFrame {
	int x = 200, y = 80;
	JButton btn;
	
	public _10_3() {
		setSize(600,300);
		
		btn = new JButton("");
		btn.setLocation(x, y);
		btn.setSize(200,100);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(btn);
		panel.requestFocus();
		panel.setFocusable(true);
		
		// 무명 클래스를 이용하여 KeyListener 구현
		panel.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch (keycode) {
				case KeyEvent.VK_UP: y -= 10; break;
				case KeyEvent.VK_DOWN: y += 10; break;
				case KeyEvent.VK_LEFT: x -= 10; break;
				case KeyEvent.VK_RIGHT: x += 10; break;
				}
				btn.setLocation(x, y);
			}
			public void keyReleased(KeyEvent e) {	}
			public void keyTyped(KeyEvent e) {	}
		});
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_10_3 f = new _10_3();
	}

}
