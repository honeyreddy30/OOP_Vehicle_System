public interface Maintainable {
    int getMaintenanceInterval();

    boolean needsMaintenance(int mileage);

    void performMaintenance();
}
