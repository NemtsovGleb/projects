public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Picker picker1 = new Picker();
        Courier courier1 = new Courier();

        picker1.setWarehouse(warehouse);
        courier1.setWarehouse(warehouse);

        for(int i = 0; i < 1500; i++)
            picker1.doWork();

        for(int i = 0; i < 1000; i++)
            courier1.doWork();

        picker1.bonus();
        courier1.bonus();

        System.out.println(picker1.getSalary());
        System.out.println(courier1.getSalary());

        System.out.println(warehouse);

        Warehouse warehouse2 = new Warehouse();

        Picker picker2 = new Picker();
        Courier courier2 = new Courier();

        picker2.setWarehouse(warehouse2);
        courier2.setWarehouse(warehouse2);

        picker2.doWork();
        courier2.doWork();

        System.out.println(warehouse);
        System.out.println(warehouse2);


    }
}