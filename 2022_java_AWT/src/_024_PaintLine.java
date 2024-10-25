import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class _024_PaintLine extends JFrame {
	int x1, y1, x2, y2;

	class Panel extends JPanel {
		public Panel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent event) {
					x1 = event.getX();
					y1 = event.getY();
				}
			});
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent event) {
					x2 = event.getX();
					y2 = event.getY();
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			g.drawLine(x1, y1, x2, y2);

		}
	}

	public _024_PaintLine() {
		setSize(600, 600);
		add(new Panel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_024_PaintLine p = new _024_PaintLine();

	}

}
