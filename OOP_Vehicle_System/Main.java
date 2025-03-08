public class Main {
    public static void main(String[] args) {
        Car sedan = new Car("Camry", 2023, 4, true);
        Motorcycle sportBike = new Motorcycle("Ninja", 2022, 650);
        Truck pickup = new Truck("F-150", 2021, 2500);

        RepairShop shop = new RepairShop();

        shop.serviceCar(sedan, 5000);
        shop.serviceCar(sedan, 15000, true);

        shop.checkVehicleStatus(sedan);

        double repairCost = shop.estimateRepairCost(3, 250.75);
        System.out.println("Repair estimate: $" + repairCost);

        String report = shop.generateReport(pickup);
        System.out.println(report);

        if (pickup.needsMaintenance(12000)) {
            pickup.performMaintenance();
        }
    }
}
