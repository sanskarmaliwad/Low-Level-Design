import Strategy.SpecificDriveStrategy;

public class SportsCar extends Vehicle{
    SportsCar()
    {
        super(new SpecificDriveStrategy());
    }
}
