// Chapter 5 Question 18

// This program prompts the user to enter miles traveled and
// gas spent and calculates the car's gas mileage
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
*/
import java.util.Scanner;

public class GasMileage
{
  public static double gasMileage(int miles, int mileage)
  {
    return (mileage*100)/miles;
  }
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Mileage: ");
    int mileage = input.nextInt();
    System.out.print("Miles: ");
    int miles = input.nextInt();
    
    input.close();
    
    double g = gasMileage(miles, mileage);
    System.out.printf("gallons spent " + g);
  }
}
