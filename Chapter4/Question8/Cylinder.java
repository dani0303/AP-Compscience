
/**
 * Write a description of class Cylinder here.
 *
 * @author (Daniel Rodriguez)
 * @version (Question8b 10/26/21)
 */
public class Cylinder
{
    private double height;
    private Circle base;
    
    public Cylinder(int r, double h)
    {
        base = new Circle(r);
        height = h;
    }
    
    public double getVolume()
    {
        return base.getArea() * height;
    }
}
