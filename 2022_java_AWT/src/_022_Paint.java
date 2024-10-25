import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Point {
   int x, y;
   public Point(int x, int y) {
      this.x = x;
      this.y = y;
   }
}

public class _022_Paint extends JFrame {
   int x, y;
   Vector<Point> list = new Vector<>(); //Point 객체를 저장할 백터 생성 
   
   class MyPanel extends JPanel {
      public MyPanel() {
         addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent event) {
               x = event.getX();
               y = event.getY();
               list.add(new Point(x, y)); //마우스가 드래그되면 백터에 좌표 추가 
               repaint();
            }
         });
      }
      
      public void paintComponent(Graphics g) {
         super.paintComponents(g); //백터에 저장된 좌표를 꺼내서 타원으로 그리기 
         for (Point p : list) 
            g.fillOval(p.x, p.y, 4, 4);
      }
   }
   
   public _022_Paint () {
      setSize(600, 600);
      add(new MyPanel());
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   _022_Paint p = new _022_Paint();
   }

}