import java.awt.Graphics;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

class Point {
   int x, y;
   public Point(int x, int y) {
      this.x = x;
      this.y = y;
   }
}

public class _12_1 extends JFrame {
   int x, y;
   Vector<Point> list = new Vector<>(); // Point 객체를 저장할 백터 생성 
   
   class MyPanel extends JPanel {
      public MyPanel() {
         addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent event) {
               x = event.getX();
               y = event.getY();
               list.add(new Point(x, y)); // 마우스가 드래그되면 백터에 좌표 추가 
               repaint();
            }
         });
      }
      
      public void paintComponent(Graphics g) {
         super.paintComponents(g); // 백터에 저장된 좌표를 꺼내서 타원으로 그리기 
         for (Point p : list) 
            g.fillOval(p.x, p.y, 4, 4);
      }
   }
   
   public _12_1() {
      setSize(600, 150);
      add(new MyPanel());
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   _12_1 f = new _12_1();
   }

}