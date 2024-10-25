import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class _023_PaintCircle extends JFrame {
	int x1, y1, x2, y2;

	class Panel extends JPanel {
		public Panel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent event) {
					x1 = event.getX();
					y1 = event.getY();
					repaint();
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
			super.paintComponents(g);
			if (x1>x2) 
				g.drawOval(x2, y2, Math.abs(x1 - x2), Math.abs(y1 - y2));
			else
				g.drawOval(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
		}
	}

	public _023_PaintCircle() {
		setSize(600, 600);
		add(new Panel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_023_PaintCircle p = new _023_PaintCircle();
	}

}
