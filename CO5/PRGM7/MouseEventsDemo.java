import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MouseEventsDemo" width="500" height="450">
</applet>
*/

public class MouseEventsDemo extends Applet
implements MouseListener, MouseMotionListener{
	
	String msg="";
	int x,y;

	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	/*public void windowActivated(WindowEvent we){
		showStatus("Window activated");
	}
	public void windowDeactivated(WindowEvent we){
		showStatus("Window Deactivated");
	}
	
	public void windowOpened(WindowEvent we){
		showStatus("Window is opened");
	}
	public void windowClosed(WindowEvent we){
		showStatus("windowClosed");
	}
	public void windowClosing(WindowEvent we){
		showStatus("Window closing");
	}*/
	
	public void mouseClicked(MouseEvent me){
		msg="mouse clicked";
		repaint();
	}

	public void mouseEntered(MouseEvent me){
		showStatus("Mouse Entered");
		repaint();
	}

	public void mouseExited(MouseEvent me){
		showStatus("Mouse Exited");
		repaint();
	}

	public void mousePressed(MouseEvent me) {

		x= me.getX();
		y= me.getY();
		msg = "MousePressed at ("+x+","+y+")";
		repaint();
	}

	public void mouseReleased(MouseEvent me) {
		setBackground(Color.white);
		msg = "Up";
		repaint();
	}

	public void mouseDragged(MouseEvent me) {
		setBackground(Color.gray);
		x= me.getX();
		y= me.getY();
		showStatus("Mouse dragged");
		repaint();
	}

	public void mouseMoved(MouseEvent me) {
		showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
	}

	public void paint(Graphics g) {
		g.drawString(msg, 10,20);
	}
}
