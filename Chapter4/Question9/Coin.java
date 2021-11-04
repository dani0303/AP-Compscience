
/**
 * Write a description of class Coin here.
 *
 * @author (Daniel Rodriguez)
 * @version (Question9 10/27/21)
 */

import java.awt.Image;
import java.awt.Graphics;
public class Coin
{
    private Image tails, heads;
    private int side = 1;
    
    public Coin(Image t, Image h)
    {
        tails = t;
        heads = h;
    }
    
    public void flip()
    {
        side = -side;
    }
    
    public void draw(Graphics g, int x, int y)
    {
        if(side == 1)
        {
           int X = heads.getWidth(null)/2;
           int Y = heads.getHeight(null)/2;
           g.drawImage(heads, X-X/2, Y-Y/2, null);
        }else
        {
            int tailsX = tails.getWidth(null)/2;
            int tailsY = tails.getHeight(null)/2;
            g.drawImage(tails, tailsX-tailsX/2, tailsY-tailsY/2, null);
        }
        
    }
}
