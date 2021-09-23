import java.awt.*;
import java.applet.*;
/*
<applet code="MaxNumber" width=200 height=300>
<param name=num1 value=10>
<param name=num2 value=123>
<param name=num3 value=170>
</applet>
*/

public class MaxNumber extends Applet
{
	String param;
	int max;
	public void init()
	{
		setBackground(Color.blue);
		setForeground(Color.red);
	}
	public void start()
	{
		param=getParameter("num1");
		int val1=Integer.parseInt(param);
		param=getParameter("num2");
		int val2=Integer.parseInt(param);
		param=getParameter("num3");
		int val3=Integer.parseInt(param);
		if(val1>val2)
		{
			if(val1>val3)
			{
				max=val1;
			}
			else
			{
				max=val3;
			}
		}
		else
		{
			if(val2>val3)
			{
				max=val2;
			}
			else
			{
				max=val3;
			}
		}
	}
public void paint(Graphics g)
{
	g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
	g.drawString("LARGEST NUMBER IS " +String.valueOf(max),100,150);
}
}
