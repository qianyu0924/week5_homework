import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJFrame extends JFrame implements ActionListener{
    private JPanel contentPane;
    MyJFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("calculator");
        setBounds(100, 100, 450, 350);
        setVisible(true);
    
        contentPane = new JPanel();
        
        contentPane.setLayout(new GridLayout(5,3,5,5));
        setContentPane(contentPane);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(this);
        contentPane.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(this);
        contentPane.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(this);
        contentPane.add(btn3);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(this);
        contentPane.add(btn4);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(this);
        contentPane.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(this);
        contentPane.add(btn6);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(this);
        contentPane.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(this);
        contentPane.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(this);
        contentPane.add(btn9);

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(this);
        contentPane.add(btnPlus);

        JButton btn0 = new JButton("0");
        btn0.addActionListener(this);
        contentPane.add(btn0);

        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(this);
        contentPane.add(btnMinus);

        JButton btnTimes = new JButton("x");
        btnTimes.addActionListener(this);
        contentPane.add(btnTimes);

        JButton btnEquals = new JButton("=");
        btnEquals.addActionListener(this);
        contentPane.add(btnEquals);

        JButton btnDivided = new JButton("÷");
        btnDivided.addActionListener(this);
        contentPane.add(btnDivided);

    }

    public void actionPerformed(ActionEvent e) {
        JButton namBtn = (JButton)e.getSource();
        JOptionPane.showMessageDialog(null, namBtn.getText());
    }
    
}

public class homework {
    public static void main(String[] args) throws Exception{
        MyJFrame f1 = new MyJFrame(); 
    }
}
