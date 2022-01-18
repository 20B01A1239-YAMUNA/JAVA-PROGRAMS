import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonDemo extends JFrame implements ActionListener{
	
	JLabel l1;
	JTextField t1;
	JButton b1,b2,b3;
	public ButtonDemo()
	{
		super("ButtonDemo");
		l1=new JLabel("Your Name");
		t1=new JTextField(12);
		b1=new JButton("yes");
		b2=new JButton("no");
		b3=new JButton("submit");
		setLayout(new FlowLayout());
		
		add(b1);
		add(b2);
		add(b3);
		add(l1);
		getContentPane().add(t1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setSize(500,500);
		setLocation(10,10);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		show();
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("yes"))
		{
			JOptionPane.showMessageDialog(this, "you pressed yes");
		}
		
	
		else if(ae.getActionCommand().equals("no"))
		{
			JOptionPane.showMessageDialog(this, "you pressed no");
		}
		
		else {
	
		if(ae.getActionCommand().equals("submit"))
		{
			JOptionPane.showMessageDialog(this, "you pressed submit");
		}
		
	}
	}
	
	
	public static void main(String[] args) {
		
		new ButtonDemo();
	}

	
	
	
}
