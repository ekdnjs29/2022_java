import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _001_Euclid extends JFrame {
	public _001_Euclid() {
		setTitle("001_Euclid");
		setSize(400, 200);
		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));

		JLabel lbl = new JLabel("Eucild 최대공약수 알고리즘");
		panel1.add(Box.createVerticalStrut(30));
		panel1.add(lbl);
		panel1.add(Box.createVerticalStrut(10));
		panel.add(panel1);

		JTextField txt1 = new JTextField(10);
		JTextField txt2 = new JTextField(10);
		JButton btn = new JButton("Find");
		panel2.add(txt1);
		panel2.add(txt2);
		panel2.add(btn);
		panel.add(panel2);
		
    	JLabel lbl_gcd = new JLabel();
		
		btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int x = Integer.parseInt(txt1.getText());
            	int y = Integer.parseInt(txt2.getText());
            	
            	int gcd = Euclid(x, y);
        		
            	lbl_gcd.setText("최대공약수 = " + gcd);
        		panel3.add(Box.createVerticalStrut(10));
            	panel3.add(lbl_gcd);
        		panel3.add(Box.createVerticalStrut(30));
            	panel.add(panel3);
            	revalidate();
            }
        });
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private int Euclid(int x, int y) {
		if (y == 0)
			return x;
		else
			return Euclid(y, x % y);
	}

	public static void main(String[] args) {
		_001_Euclid f = new _001_Euclid();
	}

}
