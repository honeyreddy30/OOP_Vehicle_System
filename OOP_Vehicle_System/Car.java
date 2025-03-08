public class Car extends Vehicle {
    private int numDoors;
    private boolean isHybrid;

    public Car(String model, int year, int numDoors, boolean isHybrid) {
        super(model, year);
        this.numDoors = numDoors;
        this.isHybrid = isHybrid;
    }

    @Override
    public double calculateFuelEfficiency() {
        return isHybrid ? 45.5 : 25.5;
    }

    public void drive(int distance) {
        System.out.println("Car driving " + distance + " miles");
    }
}
