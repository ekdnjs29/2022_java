// 프레임 클래스가 이벤트 처리

import javax.swing.*;
import java.awt.event.*;

public class _10_2 extends JFrame implements ActionListener {
	private JButton btn;
	private JLabel lbl;
	int count = 0;		
	
	public void actionPerformed(ActionEvent e) {
		count++;
		lbl.setText(count+"");
	}
	
	public _10_2() {
		setSize(400, 150);
		
		JPanel panel = new JPanel();
		btn = new JButton("count");
		lbl = new JLabel(count+"");
		
		// 현재 객체를 이벤트 리스너로 버튼에 등록 (자기자신이 이벤트 처리)
		btn.addActionListener(this); 
		
		panel.add(lbl);
		panel.add(btn);
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_10_2 f = new _10_2();
	}

}
