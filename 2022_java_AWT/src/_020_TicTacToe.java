import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _020_TicTacToe extends JFrame implements ActionListener {
	private JPanel panel;
	private JButton[][] btns;
	private char turn = 'X';

	public _020_TicTacToe() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		add(panel, BorderLayout.CENTER);
		btns = new JButton[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				btns[i][j] = new JButton(" ");
				btns[i][j].addActionListener(this);
				panel.add(btns[i][j]);
			}
		}
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(e.getSource()==btns[i][j] && btns[i][j].getText().equals(" ")==true) {
					if (turn == 'X') {
						btns[i][j].setText("X");
						turn = 'O';
					}
					else {
						btns[i][j].setText("O");
						turn = 'X';
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_020_TicTacToe ttt = new _020_TicTacToe();
	}

}
