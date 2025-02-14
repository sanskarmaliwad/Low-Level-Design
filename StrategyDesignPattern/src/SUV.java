import Strategy.SpecificDriveStrategy;

public class SUV extends Vehicle{
    SUV()
    {
        super(new SpecificDriveStrategy());
    }
}
