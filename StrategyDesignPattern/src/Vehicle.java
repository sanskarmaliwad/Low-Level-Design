import Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy ds;


    //This is constructor Injection
    Vehicle(DriveStrategy ds)
    {
        this.ds = ds;
    }

    void drive()
    {
        ds.drive();
    }

}


