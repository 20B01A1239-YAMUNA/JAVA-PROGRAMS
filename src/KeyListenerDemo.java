import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyListenerDemo extends JFrame implements KeyListener
{
          JButton b1,b2,b3,b4;
          public KeyListenerDemo()
          {
        	  b1=new JButton("B");
        	  b2=new JButton("R");
        	  b3=new JButton("P");
        	  b4=new JButton("G");
        	  setLayout(new FlowLayout());
        	  add(b1);
        	  add(b2);
        	  add(b3);
        	  add(b4);
              addKeyListener(this);
              setFocusable(true);
              setSize(500,500);
              setLocation(500,500);
              setResizable(false);
              setDefaultCloseOperation(EXIT_ON_CLOSE);
              setVisible(true);
          }
          public void keyPressed(KeyEvent ke)
          {
        	  if(ke.getKeyChar()=='B'){
        		  b1.setBackground(Color.BLUE);
        		  }
        	  else if(ke.getKeyChar()=='R')
        		  b2.setBackground(Color.RED);
        	  else if(ke.getKeyChar()=='P')
        		  b3.setBackground(Color.PINK);
        	  else if(ke.getKeyChar()=='G')
        		  b4.setBackground(Color.GREEN);
          }
          public void keyReleased(KeyEvent ke){}
          public void keyTyped(KeyEvent ke){
        	 
          }
          public static void main(String args[])
          {
        new KeyListenerDemo();
          }
}