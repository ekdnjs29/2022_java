import java.awt.*;
import javax.swing.*;

public class _011_rgbButton extends JFrame {
	public _011_rgbButton() {
		JPanel panel = new JPanel();
	    panel.setLayout(new GridLayout(4, 5));
	    JButton[] buttons = new JButton[20];
	    
	    int index = 0;
	    for (int rows=0; rows<4; rows++) {
	    	for (int cols=0; cols<5; cols++) {
	    		int R = (int)(Math.random()*256);
	    		int G = (int)(Math.random()*256);
	    		int B = (int)(Math.random()*256);
	    		Color color = new Color(R, G, B);
	    		buttons[index] = new JButton(index+1+"");
	    		buttons[index].setBackground(color);
	    		
	    		//Mac에서 버튼 색 설정 
	    		buttons[index].setOpaque(true); //버튼 뒤 배경색 설정 
				buttons[index].setBorderPainted(false); //버튼 투명 
				//Apple 디자인 제외 
				try { UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); }
				catch(Exception e) { e.printStackTrace(); }
				
	    		panel.add(buttons[index]);
	        	index++;
	    	}
	    }
	    add(panel);
	    setSize(800, 400);
	    setVisible(true);	   
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_011_rgbButton f = new _011_rgbButton();
	}

}