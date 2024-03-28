package Assignment4;

public class VehicleTester {
    public static void main(String[] args) {

        Vehicle Vehicle = new Vehicle("Ford", "Mustang", 2007, "1F4GFDYRXGS324567");
        Motorcycle Motorcycle = new Motorcycle("Honda", "Shadow", 2004, "JH2RC040XBM200124", 750, "4 Stroke");
        Automobile Automobile = new Automobile("Chevy", "Corvette", 1975, "1G4EDYR2XAS123456", 254, "unleaded");

        Vehicle.getVehicleInfo();
        Motorcycle.getVehicleInfo();
        Automobile.getVehicleInfo();
    }
}
