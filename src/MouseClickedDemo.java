import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MouseClickedDemo extends JFrame implements MouseListener{ 
JLabel l1;
public MouseClickedDemo(){
super("Mouse events");
l1=new JLabel();
setLayout(new FlowLayout());
add(l1);
addMouseListener(this);
setSize(200,200);
setLocation(50,50);
setResizable(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
show();
}
public void mouseClicked(MouseEvent me) {
int x = me.getX();
int y = me.getY();
l1.setText("Mouse clicked at" +x+""+y);
}
public void mouseEntered(MouseEvent me) {
	int x = me.getX();
	int y = me.getY();
	l1.setText("Mouse Entered at" +x+""+y);
}
public void mouseExited(MouseEvent me) {
	int x = me.getX();
	int y = me.getY();
	l1.setText("Mouse Exited at" +x+""+y);
}
public void mousePressed(MouseEvent me) {
	int x = me.getX();
	int y = me.getY();
	l1.setText("Mouse pressed at" +x+""+y);
}
public void mouseReleased(MouseEvent me) {
	int x = me.getX();
	int y = me.getY();
	l1.setText("Mouse Released at" +x+""+y);
}
public static void main(String[] args) {
new MouseClickedDemo();
}
}