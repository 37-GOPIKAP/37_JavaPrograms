import java.awt.*;
import java.applet.*;
/*
<applet code="DrawFigures" width=100 height=200>
</applet>
*/
public class DrawFigures extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillOval(10,10,200,200);
		g.setColor(Color.yellow); 
		g.fillRect(300,10,200,200);
		g.setColor(Color.red);
		g.drawLine(800,10,700,300);
	}
}
