/*
John Skinner
2024-03-25
This program will set, get, and display diffrent types of vehicles.

This class Sets the class Vehicle 
 */

package Assignment4;

// Created the Vehicle class
public class Vehicle {
    // declare private varables
    private String make;
    private String model;
    private int year;
    private String VIN;

    // Get methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVIN() {
        return VIN;
    }

    public int getYear() {
        return year;
    }

    // Set methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // constant for Valid vin length
    final byte VALID_VIN_LENGTH = 17;

    // putting all the set methods in a constuctor
    public Vehicle(String make, String model, int year, String VIN) {
        setMake(make);
        setModel(model);
        setYear(year);
        setVIN(VIN);
    }

    // display function
    public String getVehicleInfo() {
        return "Make: " + getMake() + "\nModel: " + getModel() + "\nYear: " + getYear() + "\nVIN: " + getVIN();
    }
}
