/**
 * Write a description of class CarType here.
 *
 * @author (Daniel Rodriguez)
 * @version (11/7/21)
 */
public class CarType extends Car
{
    private boolean gasPower;
    public int numGallons, numWheels, numCylinders;
    
    public CarType(boolean gp, int ng, int nw, int nc, String ma, String mo)
    {
        super(ma, mo);
        gp=gasPower;
        ng=numGallons;
        nw=numWheels;
        nc=numCylinders;
    }
    
    /**
     * "getPowerType" will be used to check if gasPower is true
     * if so then it will return true if not then it will return false
     */
    public boolean isGasPower()
    {
        return gasPower;
    }
    
    /**
     * "setNumberCylinders" will first check if isGasPower is true or false
     * if true nc will be set to "numCylinders"
     * if not then it will print a message
     */
    public void setNumCylinders(int nc)
    {
        if(isGasPower() == true)
            nc=numCylinders;
        else
            System.out.println("Car is not gas powered");
    }
    
    /**
     * "getNumGallons" will return numGallons if isGasPower is true
     */
    public int getNumGallons()
    {
        if(isGasPower() == true)
            return numGallons;
        else
            return 0;
    }
}
