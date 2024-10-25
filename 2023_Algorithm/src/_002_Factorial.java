import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class _002_Factorial extends JFrame {
	private JTextField textBox;
    private JButton btn;
    private JList<String> listBox;
    
	public _002_Factorial() {
		setTitle("002_Factorial");
		setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel textBlock = new JLabel("다음 숫자의 펙토리얼 계산!");
        textBlock.setBounds(45, 45, 250, 20);
        panel.add(textBlock);

        textBox = new JTextField();
        textBox.setBounds(45, 90, 148, 20);
        panel.add(textBox);

        btn = new JButton("계산");
        btn.setBounds(218, 90, 87, 20);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });
        panel.add(btn);

        listBox = new JList<>();
        listBox.setBounds(45, 145, 250, 200);
        panel.add(listBox);

        add(panel);
        setVisible(true);
    }

    private void calculateFactorial() {
        try {
            int inputNumber = Integer.parseInt(textBox.getText());
            DefaultListModel<String> model = new DefaultListModel<>();
            int factorial = 1;

            for (int i = 1; i <= inputNumber; i++) {
                factorial *= i;
                model.addElement(i + "! = " + factorial);
            }

            listBox.setModel(model);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "숫자를 입력하세요.", "오류", JOptionPane.ERROR_MESSAGE);
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_002_Factorial f = new _002_Factorial();

	}

}
