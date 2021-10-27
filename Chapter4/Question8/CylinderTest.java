
/**
 * Write a description of class CylinderTest here.
 *
 * @author (Daniel Rodriguez)
 * @version (Question8b 10/26/21)
 */

import java.util.Scanner;

public class CylinderTest
{   
    public static void main(String[] args)
    {   
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter the radius ");
        int radius = s1.nextInt();
        
        System.out.println("Enter height ");
        int height = s1.nextInt();
        
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("The volume is " + cylinder.getVolume());
        
        
    }
}
