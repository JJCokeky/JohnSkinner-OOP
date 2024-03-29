/*
John Skinner
2024-03-25
This program will set, get, and display diffrent types of vehicles.

This class tests all of the classes made in assignment 4
 */
package Assignment4;

public class VehicleTester {
    public static void main(String[] args) {
        // call the constuctors
        Vehicle Vehicle = new Vehicle("Ford", "Mustang", 2007, "1F4GFDYRXGS324567");
        Motorcycle Motorcycle = new Motorcycle("Honda", "Shadow", 2004, "JH2RC040XBM200124", 750, "4 Stroke");
        Automobile Automobile = new Automobile("Chevy", "Corvette", 1975, "1G4EDYR2XAS123456", 254, "unleaded");

        // display the info
        System.out.println(Vehicle.getVehicleInfo());
        System.out.println(Motorcycle.getVehicleInfo());
        System.out.println(Automobile.getVehicleInfo());

        // Made the array with the diffrent vehicle types
        Vehicle[] vehicles = { Vehicle, Automobile, Motorcycle };

        // itterate through the vehicle types using get vehicle info
        for (Vehicle i : vehicles) {
            System.out.println(i.getVehicleInfo());
        }

    }
}
