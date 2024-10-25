import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _021_MoveButton extends JFrame implements MouseListener {
	int btnX = 250, btnY = 100;
	JButton btn;
	ImageIcon img = new ImageIcon("./Button_Image/Car.png");
	
	public _021_MoveButton() {
		setSize(600, 300);
		JPanel panel = new JPanel();
		panel.addMouseListener(this);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		btn = new JButton();
		btn.setSize(100,80);
		btn.setIcon(img);
		btn.setLocation(btnX, btnY);
		btn.setBorderPainted(false); //버튼 테두리 투명
		btn.setFocusPainted(false); //포커스 표시
		panel.add(btn);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 1) {
			btnX += 5;
			btn.setLocation(btnX, btnY);
		}
		else if(e.getButton() == 3) {
			btnX -= 5;
			btn.setLocation(btnX, btnY);
		}
	}
	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }
	public void mouseClicked(MouseEvent e) { }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_021_MoveButton m = new _021_MoveButton();
	}

}
