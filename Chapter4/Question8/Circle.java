
/**
 * Write a description of class Circle here.
 *
 * @author (Daniel Rodriguez)
 * @version (Question 8 10/26/21)
 */
public class Circle
{
    private int radius;
    
    public Circle(int r)
    {
        radius = r;
    }
    
    public double getArea()
    {
        double Area = Math.PI * (radius*radius);
        return Area;
    }
}
