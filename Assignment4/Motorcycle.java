/*
John Skinner
2024-03-25
This program will set, get, and display diffrent types of vehicles.

This class extends vehicle to add engine size and engine type 
 */
package Assignment4;

// Creating the class Motorcycle that extends Vehicle
public class Motorcycle extends Vehicle {
    // declare private varables
    private int engineSize;
    private String engineType;

    // get methods
    public int getEngineSize() {
        return engineSize;
    }

    public String getEngineType() {
        return engineType;
    }

    // set methods
    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void setFuelType(String engineType) {
        this.engineType = engineType;
    }

    // putting all the set methods in a constuctor using super to get make, model,
    // year, vin from parent class
    public Motorcycle(String make, String model, int year, String VIN, int engineSize, String engineType) {
        super(make, model, year, VIN);
        this.engineSize = engineSize;
        this.engineType = engineType;
    }

    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + "\nEngine Size: " + getEngineSize() + "\nEngine Type: " + getEngineType();

    }
}
