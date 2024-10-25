// 내부 클래스에서 이벤트 처리

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class _10_1 extends JFrame {
	private JButton btn;
	private JLabel lbl;
	int count = 0;
	
	// 내부 클래스로 이벤트 처리
	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			count++;
			lbl.setText(count+"");
		}
	}
	
	public _10_1() {
		setSize(400, 150);
		setLayout(new FlowLayout());
		
		btn = new JButton("count");
		lbl = new JLabel(count+"");
		
		// 버튼에 이벤트 처리 객체 등록
		btn.addActionListener(new MyListener()); 
		
		add(lbl, "Center");
		add(btn, "East");
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_10_1 f = new _10_1();
	}

}
