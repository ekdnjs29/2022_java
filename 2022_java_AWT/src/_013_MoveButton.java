import java.awt.event.*;
import javax.swing.*;

public class _013_MoveButton extends JFrame {
	int btnX = 150, btnY = 150;
	JButton btn;
	
	public _013_MoveButton() {
		setSize(600, 300);
		btn = new JButton("");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		btn.setLocation(btnX, btnY);
		btn.setSize(200,100);
		panel.add(btn);
		panel.requestFocus();
		panel.setFocusable(true);
		// 익명클래스 
		// 마우스가 클릭되면 버튼의 위치 변경
		panel.addMouseListener(new MouseListener ( ) {
			public void mousePressed(MouseEvent e) {
				btnX = e.getX();
				btnY = e.getY();
				btn.setLocation(btnX, btnY);
			}
			public void mouseReleased(MouseEvent e) {	} 
			public void mouseEntered(MouseEvent e) {	} 
			public void mouseExited(MouseEvent e) {    }  
			public void mouseClicked(MouseEvent e) {	} 
		});
		// 마우스로 버튼 이동
		panel.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
				btnX = e.getX();
				btnY = e.getY();
				btn.setLocation(btnX, btnY);
			}
			public void mouseMoved(MouseEvent e) {	}
		});
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_013_MoveButton f = new _013_MoveButton();
	}

}
