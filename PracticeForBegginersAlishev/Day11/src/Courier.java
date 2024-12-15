public class Courier implements Worker {
    private double salary;
    private Warehouse warehouse;

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(1_000);
    }

    @Override
    public void bonus() {
        if(warehouse.getBalance() == 1_000_000)
            salary = salary * 2;
    }
}
