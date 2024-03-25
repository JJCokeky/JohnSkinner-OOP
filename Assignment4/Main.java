/*
John Skinner
2024-03-25
This program is designed to set and check that vin numbers are valid 
 */

package Assignment4;

public class Main {

}

class Car {
    private String make;
    private String model;
    private int year;
    private String VIN;

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

    final byte VALID_VIN_LENGTH = 17;

    public void SetInfo(String make, String model, int year, String VIN) {
        setMake(make);
        setModel(model);
        setYear(year);
        setVIN(VIN);
    }

    public void getVehicleInfo() {
        getMake();
        getModel();
        getVIN();
        getYear();
    }
}
