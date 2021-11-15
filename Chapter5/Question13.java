
/**
 * Write a description of class Question13 here.
 *
 * @author (Daniel Rodriguez)
 * @version (11/12/21)
 */
import java.util.Scanner;
public class Question13
{
    private static int a, b, c;
    private static double temp = Math.sqrt(b * b - 4 * a * c);
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        System.out.print("enter a: \n");
        a = k.nextInt();
        System.out.println("enter b: \n");
        b = k.nextInt();
        System.out.println("enter c: \n");
        c = k.nextInt();
        k.close();
        
        
        if(temp > 0.0)
        {
            double x1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
            double x2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
            System.out.println("x1 is " + x1 + " and x2 is " + x2);
        }
        if(temp == 0.0)
        {
            double vertex = -b/2*a;
            System.out.println("The equation has one solution " + vertex);
        }
        else
        {
            System.out.println("no roots");
        }
    }
}
