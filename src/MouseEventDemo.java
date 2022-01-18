import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MouseEventDemo extends JFrame implements MouseListener{ 
JLabel l1;
public MouseEventDemo(){
super("Mouse events");
l1=new JLabel();
setLayout(new FlowLayout());
add(l1);
addMouseListener(this);
setSize(150,200);
setLocation(50,50);
setResizable(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
show();
}
public void mouseClicked(MouseEvent me) {
getContentPane().setBackground(Color.red);
l1.setText("clicked");
}
public void mouseEntered(MouseEvent me) {
getContentPane().setBackground(Color.yellow);
l1.setText("Entered window");
}
public void mouseExited(MouseEvent me) {
getContentPane().setBackground(Color.blue);
l1.setText("Exited");
}
public void mousePressed(MouseEvent me) {
getContentPane().setBackground(Color.orange);
}
public void mouseReleased(MouseEvent me) {
getContentPane().setBackground(Color.white);
}
public static void main(String[] args) {
new MouseEventDemo();
}
}