
/**
 * Write a description of class LunchTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class LunchTest
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        LunchTime Lt = new LunchTime();
        System.out.println("Enter the current time ");
        String usr = s.nextLine();
        int i = usr.indexOf(":");
        int hours = Integer.parseInt(usr.substring(0, i));
        int mins = Integer.parseInt(usr.substring(i+1));
        
        int minLeft = Lt.minutesUntilLunch(hours, mins);
        System.out.println(minLeft);
    }
}
