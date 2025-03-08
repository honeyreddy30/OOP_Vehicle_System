public class Motorcycle extends Vehicle {
    private int engineCC;

    public Motorcycle(String model, int year, int engineCC) {
        super(model, year);
        this.engineCC = engineCC;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 50.0 + (1000 - engineCC) / 100;
    }

    public void ride(int distance) {
        System.out.println("Motorcycle riding " + distance + " miles");
    }
}
