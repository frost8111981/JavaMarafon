package day11.task1;

import java.sql.SQLOutput;

public class Picker implements Worker {         // Сборщик
    private int salary;
    private final int SALARY_TASK = 80;
    private boolean isPayed;
    private Warehouse warehouse; // Чтобы связать два обьекта из разных классов создаем ссылку.

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", SALARY_TASK=" + SALARY_TASK +
                ", isPayed=" + isPayed +
                ", warehouse=" + warehouse +
                '}';
    }

    @Override
    public void doWork() {
        salary += SALARY_TASK;
        warehouse.peckerOrder();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }
}



