import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
class LoginFormDemo extends JFrame implements ActionListener
{
JButton b1;
JPanel newPanel;
JLabel userLabel, passLabel;
JTextField textField1, textField2;
public LoginFormDemo()
{
super("Login Form");
userLabel = new JLabel();
userLabel.setText("Username");
textField1 = new JTextField(15);
passLabel = new JLabel();
passLabel.setText("Password");
textField2 = new JPasswordField(15);
b1 = new JButton("SUBMIT");
newPanel = new JPanel(new GridLayout(3, 1));
newPanel.add(userLabel);
newPanel.add(textField1);
newPanel.add(passLabel);
newPanel.add(textField2);
newPanel.add(b1);
setLayout(new FlowLayout());
add(newPanel);
b1.addActionListener(this);
setSize(400,200);
setLocation(100,100);
setResizable(false);
setDefaultCloseOperation(EXIT_ON_CLOSE);
show();

}
public void actionPerformed(ActionEvent ae)
{
String userValue = textField1.getText();
String passValue = textField2.getText();
String output="Username:"+userValue+"\n Password:"+passValue;
JOptionPane.showMessageDialog(this, output);
}
public static void main(String args[]){
new LoginFormDemo();
}
}