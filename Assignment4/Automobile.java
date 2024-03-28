/*
John Skinner
2024-03-25
This program will set, get, and display diffrent types of vehicles.

This class extends vehicle to add horsepower and fuel type 
 */
package Assignment4;

// Creating the class Automobile that extends Vehicle 
public class Automobile extends Vehicle {
    // declare private varables
    private int horsepower;
    private String fuelType;

    // get methods
    public int getHorsepower() {
        return horsepower;
    }

    public String getFuelType() {
        return fuelType;
    }

    // set methods
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // putting all the set methods in a constuctor using super to get make, model,
    // year, vin from parent class
    public Automobile(String make, String model, int year, String VIN, int horsepower, String fuelType) {
        super(make, model, year, VIN);
        setHorsepower(horsepower);
        setFuelType(fuelType);
    }

    // override and display information from parent class as well as display
    // automobile spefic info
    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + "\nPower: " + getHorsepower() + "\nFuel Type: " + getFuelType();
    }
}