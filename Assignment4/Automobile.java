package Assignment4;

public class Automobile extends Car {
    private int horsepower;
    private String fuelType;

    public int getHorsepower() {
        return horsepower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public Automobile(String make, String model, int year, String VIN, int horsepower, String fuelType) {
        super(make, model, year, VIN);
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    @Override
    public String getVehicleInfo() {
        Super.getVehicleInfo();

    }
}