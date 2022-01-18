import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GradeCalculator extends JFrame implements ActionListener
{
   JButton b1,b2,b3,b4,b5;
   JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
   public GradeCalculator()
   {
	   super("GRADE CALCULATOR");
	   b1=new JButton("Calculate Total");
	   b2=new JButton("Calculate %");
	   b3= new JButton("Calculate Grade");
	   b4=new JButton("Clear");
	   b5=new JButton("Exit");
	   t1=new JTextField(20);
	   t2=new JTextField(5);
	   t3=new JTextField(5);
	   t4=new JTextField(5);
	   t5=new JTextField(5);
	   t6=new JTextField(5);
	   t7=new JTextField(5);
	   t8=new JTextField(5);
	   t9=new JTextField(5);
	   t7.setEditable(false);
	   t8.setEditable(false);
	   t9.setEditable(false);

	   l1=new JLabel("Grade Calculator",JLabel.CENTER);
	   l2=new JLabel("Name:",JLabel.LEFT);
	   l3=new JLabel("English:",JLabel.LEFT);
	   l4=new JLabel("Physics:",JLabel.LEFT);
	   l5=new JLabel("Chemistry:",JLabel.LEFT);
	   l6=new JLabel("Computer:",JLabel.LEFT);
	   l7=new JLabel("Maths:",JLabel.LEFT);
	   l8=new JLabel("TOTAL:",JLabel.RIGHT);
	   l9=new JLabel("%  :",JLabel.RIGHT);
	   l10=new JLabel("Grade:",JLabel.RIGHT);
	   setLayout(new FlowLayout());
	   add(l1,BorderLayout.NORTH);
	   add(l2);
	   add(t1);
	   add(l8);
	   add(t7);
	   add(l4);
	   add(t3);
	   add(l9);
	   add(t8);
	   add(l6);
	   add(t5);
	   add(l10);
	   add(t9);
	   add(l3);
	   add(t2);
	   add(l5);
	   add(t4);
	   add(l7);
	   add(t6);
	   add(b1);
	   add(b2);
	   add(b3);
	   add(b4);
	   add(b5);
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
	   b4.addActionListener(this);
	   b5.addActionListener(this);
	   setSize(500,500);
	   setLocation(500,500);
	   setResizable(true);
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   setVisible(true);   
   }
   public void actionPerformed(ActionEvent ae)
   {
	   int n1=0,n2=0,n3=0,n4=0,n5=0;
	   try
	   {
		   n1=Integer.parseInt(t2.getText());
		   n2=Integer.parseInt(t3.getText());
		   n3=Integer.parseInt(t4.getText());
		   n4=Integer.parseInt(t5.getText());
		   n5=Integer.parseInt(t6.getText());

	   }
	   catch(NumberFormatException ne){}
	   int sum=n1+n2+n3+n4+n5;
	   String g,s="";
	   int per =(sum /500)*100;
	   if (per>90)
		   g="A";
	   else if(per>70)
		   g="B";
	   else if(per>50)
		   g="c";
	   else
		   g="F";
	   if(ae.getActionCommand().equals("Calculate Total")){
		   t7.setText(Integer.toString(sum));
	   }
	   else if(ae.getActionCommand().equals("Calculate %")){
		   t8.setText(Integer.toString(per));
	   }
	   else if(ae.getActionCommand().equals("Calculate Grade")){
		   t9.setText(g);

	   }
	   else if(ae.getActionCommand().equals("Exit"))
	   {
		System.exit(0);   
	   }
	   else if(ae.getActionCommand().equals("Clear"))
	   {
		   t9.setText(s);
		   t2.setText(s);
		   t3.setText(s);
		   t4.setText(s);
		   t5.setText(s);
		   t6.setText(s);
		   t7.setText(s);
		   t8.setText(s);
		   t1.setText(s);
	   }
	   
   }
   public static void main(String args[])
   {
	  new GradeCalculator();
   }
}