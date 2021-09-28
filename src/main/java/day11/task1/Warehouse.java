package day11.task1;

public class Warehouse {                // Склад
   private int countPickedOrders;       // Количество собранных заказов
   private int countDeliveredOrders;    // Количество доставленных заказов


    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }

    public void peckerOrder(){
        countPickedOrders = countPickedOrders + 1;
    }

    public  void deliveredOrder(){
        countDeliveredOrders = countDeliveredOrders + 1;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }
}
