import java.awt.*;
import javax.swing.*;

public class _012_randomLable extends JFrame {
	private JPanel panel = new JPanel();
	private JLabel[] lbls = new JLabel[30];

	public _012_randomLable() {
		panel.setLayout(null);
		for (int i=0; i<30; i++) {
			lbls[i] = new JLabel(""+i);
			int x = (int)(Math.random()*750);
			int y = (int)(Math.random()*350);
			lbls[i].setSize(50, 30);
			lbls[i].setLocation(x, y);
			panel.add(lbls[i]);
		}
		setSize(800,400);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_012_randomLable f = new _012_randomLable();
	}

}
