/**
 * Write a description of class RoundBalloon here.
 *
 * @author (Daniel Rodriguez)
 * @version (11/2/21)
 */

import java.awt.Color;

public class InflatableBalloon extends Balloon
{
    private int xCenter, yCenter, radius;
    private Color color;
    public InflatableBalloon()
    {
        super();
    }
    
    public InflatableBalloon(int x, int y, int r, Color clr)
    {
        super(x, y, r, clr);
    }
    
    public void inflate(int percentage)
    {
       double radius = Math.pow(getRadius(), 3);
       int newRadius = (int)(Math.pow(radius*(1 + 0.01*percentage), 1.0/3.0) + 0.5);
       setRadius(newRadius);
    }
    
}
