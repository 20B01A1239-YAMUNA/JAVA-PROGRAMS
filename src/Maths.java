import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Maths extends JFrame implements ActionListener,MouseListener
{
    	String s1="";
        JButton b1,b2,b3,b4,b5;
        JLabel l1,l2,l3;
        JTextField t1,t2,t3;
        public Maths()
        {
        	super("Factorial,Permutations,Combinations");
        	b1=new JButton("FACTORIAL");
        	b2=new JButton("PERMUTATION");
        	b3=new JButton("COMBINATION");
        	b4=new JButton("CALCULATION");
        	b5=new JButton("CLOSE");
            l1=new JLabel("n:");
            l2=new JLabel("r:");
            l3=new JLabel("result:");
            t1= new JTextField(5);
            t2= new JTextField(5);
            t3= new JTextField(10);
            b4.setEnabled(false);
            b5.setEnabled(false);
            l1.setEnabled(false);
            l2.setEnabled(false);
            l3.setEnabled(false);
            t1.setEnabled(false);
            t2.setEnabled(false);
            t3.setEnabled(false);
            setLayout(new FlowLayout());
            add(b1);
            add(b2);
            add(b3);
            add(l1);
            add(t1);
            add(l2);
            add(t2);
            add(b4);
            add(l3);
            add(t3);
            add(b5);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addMouseListener(this);
            b5.addActionListener(this);
            setSize(360,300);
            setLocation(500,500);
            setResizable(false);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
        public int fact(int n)
        {
        	int fact=1;
        	while(n!=0)
        	{
        		fact*=n;
        		--n;
        	}
        	return fact;
        }
        public void actionPerformed(ActionEvent ae)
        {
        	if(ae.getActionCommand().equals("FACTORIAL"))
        	{
        		b4.setEnabled(true);
                b5.setEnabled(true);
                l1.setEnabled(true);
                l2.setEnabled(false);
                l3.setEnabled(true);
                t1.setEnabled(true);
                t2.setEnabled(false);
                t3.setEnabled(true);
                s1="FACTORIAL";
                	
                }
        	else if(ae.getActionCommand().equals("PERMUTATION"))
        	{
        		b4.setEnabled(true);
                b5.setEnabled(true);
                l1.setEnabled(true);
                l2.setEnabled(true);
                l3.setEnabled(true);
                t1.setEnabled(true);
                t2.setEnabled(true);
                t3.setEnabled(true); 
                s1="PERMUTATION";
                }
        	else if(ae.getActionCommand().equals("COMBINATION"))
        	{
        		b4.setEnabled(true);
                b5.setEnabled(true);
                l1.setEnabled(true);
                l2.setEnabled(true);
                l3.setEnabled(true);
                t1.setEnabled(true);
                t2.setEnabled(true);
                t3.setEnabled(true);       
                	s1="COMBINATION";
                }
            else if(ae.getActionCommand().equals("CLOSE"))
                	System.exit(0);
        	}
        public void mouseExited(MouseEvent me)
        {
       	 
        }
        public void mouseReleased(MouseEvent me)
        {
        }
        public void mouseEntered(MouseEvent me)
        {
        }
        public void mousePressed(MouseEvent me)
        {
        }
        public void mouseClicked(MouseEvent me)
        {
       	 if(me.getSource().equals(b4))
       			 {
       		 if(s1.equals("FACTORIAL"))
       		 {
       			int n=Integer.parseInt(t1.getText());
            	int i=fact(n);
            	t3.setText(Integer.toString(i));
       		 }
       		 else if(s1.equals("PERMUTATION"))
       		 {
       			int n=Integer.parseInt(t1.getText());
             	int i=fact(n);
             	int n1=Integer.parseInt(t2.getText());
             	int i1=fact(n-n1);
             	t3.setText(Integer.toString(i/i1));
       		 }
       		 else if(s1.equals("COMBINATION"))
       		 {
       			int n=Integer.parseInt(t1.getText());
            	int i=fact(n);
            	int n1=Integer.parseInt(t2.getText());
            	int i2=fact(n1);
            	int i1=fact(n-n1);
            	t3.setText(Integer.toString(i/(i1*i2)));
       		 }
       			 }
        }
        public static void main(String args[])
        {
        	new Maths();
        }
}