import java.applet.Applet;
import java.awt.Graphics;

public class rectangletest extends Applet
{
	public void init()
	{
		resize(400,400);
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello,I'm applet",150,150);
	}
}