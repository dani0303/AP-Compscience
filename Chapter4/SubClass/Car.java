/**
 * Write a description of class Car here.
 *
 * @author (Daniel Rodriguez)
 * @version (11/7/21)
 */
public class Car
{
    private String make, model;
    
    public Car(String make, String model)
    {
        this.make=make;
        this.model=model;
    }
    
    public String getMake()//gets the make of the car
    {
        return make;
    }
    
    public String getModel()//gets the model of the car
    {
        return model;
    }
    
    public void setMake(String make)//sets make equal to make
    {
        make=make;
    }
    
    public void setModel(String model)//sets model equal to model
    {
        model=model;
    }
}
