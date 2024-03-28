package Assignment4;

public class Motorcycle extends Vehicle {
    private int engineSize;
    private String engineType;

    public int getEngineSize() {
        return engineSize;
    }

    public String getEngineType() {
        return engineType;
    }

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
