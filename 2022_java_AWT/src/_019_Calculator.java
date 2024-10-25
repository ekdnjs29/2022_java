import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _019_Calculator extends JFrame implements ActionListener {
	private JTextField txt;
	private JPanel panel;
	private JButton[] btns;
	private String[] lbls = {
			"AE", "CE", "√", "×",
			"7", "8", "9", "÷",
			"4", "5", "6", "-",
			"1", "2", "3", "+",
			"±", "0", ".", "="
	};
	
	private double n1,n2,result; // 첫 번째 숫자, 두 번째 숫자, 연산된 결과 저장 
	private String operator; // 입력된 연산 기억 

	public _019_Calculator() {
		txt = new JTextField();
		txt.setText("0");
		panel = new JPanel();
		panel.setLayout(new GridLayout(5,4));

		btns = new JButton[20];
		int i = 0;
		for (int r=0; r<4; r++) {
			for (int c=0; c<5; c++) {
				btns[i] = new JButton(lbls[i]);
				btns[i].addActionListener(this);
				panel.add(btns[i]);
				i++;
			}
		}
		
		add(txt, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setSize(250, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		String t = e.getActionCommand();
		if ( t=="1"||t=="2"||t=="3"||t=="4"||t=="5"||t=="6"||t=="7"||t=="8"||t=="9"||t=="0"||t==".") {
			if (txt.getText().equals("0")) {
				txt.setText("");
				txt.setText(txt.getText() + t);
			}
			else
				txt.setText(txt.getText() + t);
		}
		if ( t=="×"||t=="÷"||t=="-"||t=="+" ) {
			n1 = Double.parseDouble(txt.getText());
			operator = t;
			txt.setText("");
		}
		if (t=="AE") {
			txt.setText("0");
		}
		if (t=="CE" && !txt.getText().equals("0") && !txt.getText().equals("")) {
			String s = txt.getText();
			s = s.substring(0,s.length()-1);
			txt.setText(s);
		}
		if (t=="=") {
			n2 =  Double.parseDouble(txt.getText());
			if (operator == "+") {
				result = n1 + n2;
				txt.setText(Double.toString(result));
			}
			if (operator == "-") {
				result = n1 - n2;
				txt.setText(Double.toString(result));
			}
			if (operator == "×") {
				result = n1 * n2;
				txt.setText(Double.toString(result));
			}
			if (operator == "÷") {
				result = n1 / n2;
				txt.setText(Double.toString(result));
			}
		}
		if (t=="√") {
			result = Math.sqrt(Double.parseDouble(txt.getText()));
			txt.setText(Double.toString(result));
		}
		if (t=="±") {
			result = Double.parseDouble(txt.getText())*-1;
			txt.setText(Double.toString(result));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_019_Calculator c = new _019_Calculator();
	}

}
