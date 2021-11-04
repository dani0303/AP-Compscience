
/**
 * Write a description of class OvalBalloon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Color;
import java.awt.Graphics;
public class OvalBalloon extends Balloon
{
    public OvalBalloon()
    {
        super();
    }
    
    public OvalBalloon(int x, int y, int r, Color c)
    {
        super(x, y, r, c);
    }
    
    public void draw (Graphics g, boolean makeItFilled)
    {
        int xCenter = getX();
        int yCenter =getY();
        int radius = getRadius();
        g.fillOval(xCenter - radius, yCenter - radius, radius, 2*radius);
        g.setColor(getColor());
        
        if(makeItFilled)
        {
            g.fillOval(xCenter-radius, yCenter-radius, radius, 2*radius);
        }
        else
        {
            g.drawOval(xCenter-radius, yCenter-radius, radius, 2*radius);
        }
        
    }
}
