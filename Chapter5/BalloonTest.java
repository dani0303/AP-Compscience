
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Color;
public class BalloonTest
{
    public static void main(String[] args)
    {
        InflatableBalloon b = new InflatableBalloon();
        System.out.println(b.getRadius());
        b.inflate(50);
        System.out.println(b.getRadius());
    }
}
