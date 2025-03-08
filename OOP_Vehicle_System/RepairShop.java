public class RepairShop {
    public void serviceCar(Car car, int mileage) {
        System.out.println("Servicing " + car.getInfo() + " at " + mileage + " miles");
    }

    public void serviceCar(Car car, int mileage, boolean fullService) {
        String serviceType = fullService ? "full" : "basic";
        System.out.println("Performing " + serviceType + " service on " + car.getInfo());
    }

    public void checkVehicleStatus(Vehicle vehicle) {
        System.out.println("Checking " + vehicle.getInfo());
        System.out.println("Fuel efficiency: " + vehicle.calculateFuelEfficiency() + " mpg");
    }

    public double estimateRepairCost(int laborHours, double partsCost) {
        double laborRate = 85.0;
        return (laborHours * laborRate) + partsCost;
    }

    public String generateReport(Vehicle vehicle) {
        StringBuilder report = new StringBuilder();
        report.append("VEHICLE REPORT\n");
        report.append("===============\n");
        report.append("Vehicle: ").append(vehicle.getInfo()).append("\n");
        report.append("Fuel Efficiency: ").append(vehicle.calculateFuelEfficiency()).append(" mpg\n");
        return report.toString();
    }
}
