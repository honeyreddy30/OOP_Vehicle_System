
public abstract class Vehicle {
    protected String model;
    protected int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public abstract double calculateFuelEfficiency();

    public String getInfo() {
        return year + " " + model;
    }
}
