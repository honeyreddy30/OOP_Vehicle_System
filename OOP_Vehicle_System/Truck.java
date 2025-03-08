public class Truck extends Vehicle implements Maintainable {
    private double cargoCapacity;
    private int milesSinceService;

    public Truck(String model, int year, double cargoCapacity) {
        super(model, year);
        this.cargoCapacity = cargoCapacity;
        this.milesSinceService = 0;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 15.0 - (cargoCapacity / 1000);
    }

    @Override
    public int getMaintenanceInterval() {
        return 10000;
    }

    @Override
    public boolean needsMaintenance(int mileage) {
        this.milesSinceService = mileage;
        return mileage >= getMaintenanceInterval();
    }

    @Override
    public void performMaintenance() {
        this.milesSinceService = 0;
        System.out.println("Truck maintenance performed");
    }
}
