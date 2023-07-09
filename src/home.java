
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home implements ActionListener {
    JFrame jFrame =new JFrame();
    JTextField textField=new JTextField();
   JButton button=new JButton("Calculate");
   JLabel label=new JLabel();
    home(){
        jFrame.setBackground(Color.PINK);
        jFrame.setLayout(null);
        jFrame.setSize(600,800);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField.setBackground(Color.gray);
        textField.setBounds(150,250,250,40);
        textField.setLayout(null);
        jFrame.add(textField);
        button.setBounds(200,400,150,40);
        button.addActionListener(this);
        button.setBackground(Color.blue);
        button.setFocusable(false);
        jFrame.add(button);
        textField.setToolTipText("Type the text here");
        label.setText("Welcome to our program, " +
                "the program will help you to" +
                " calculate the length of any texts");
        label.setBounds(50,50,500,100);
        jFrame.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==button){
         String b=textField.getText();
         int d=b.length();
         String s=String.valueOf(d);
         JTextField textField1=new JTextField(s);
         textField1.setBounds(150,300,250,40);
         textField1.setBackground(Color.GRAY);
         jFrame.add(textField1);
        }
    }
}
