/**
 * Write a description of class CarTest here.
 *
 * @author (Daniel Rodriguez)
 * @version (11/7/21)
 */
public class CarTest
{
    public static void main(String[] args)
    {
        /**
         * BUG: whenever you set gas power to be true it returns false
         * if you set gas power to false it still return false
         */
        CarType v1 = new CarType(true, 50, 4, 8, "Ford", "Mustang");
        System.out.println(v1.isGasPower());
    }
}
