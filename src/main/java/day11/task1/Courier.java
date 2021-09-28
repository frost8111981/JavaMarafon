package day11.task1;

public class Courier implements Worker {        // Курьер
    private int salary;
    private final int SALARY_TASK = 100;
    private boolean isPayed;
    private Warehouse warehouse; // Чтобы связать два обьекта из разных классов создаем ссылку.

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary = salary + SALARY_TASK;
        warehouse.deliveredOrder();
    }

    @Override
    public void bonus() {

        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        return;
        }
        if(isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary = salary + 50000;
        isPayed = true;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", SALARY_TASK=" + SALARY_TASK +
                ", isPayed=" + isPayed +
                ", warehouse=" + warehouse +
                '}';
    }


}
