// 마우스로 원 그리기

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _10_4 extends JFrame implements MouseListener {
	public _10_4() {
		addMouseListener(this);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// 마우스가 클릭된 좌표에 원을 그린다
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.orange);
		g.fillOval(e.getX()-30, e.getY()-30, 60, 60);
	}
	
	public void mouseEntered(MouseEvent e) {	}
	public void mouseExited(MouseEvent e) {	}
	public void mousePressed(MouseEvent e) {	}
	public void mouseReleased(MouseEvent e) {	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_10_4 f = new _10_4();
	}

}
