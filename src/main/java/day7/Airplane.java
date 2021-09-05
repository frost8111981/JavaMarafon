package day7;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public static void compareAirplanes(Airplane air, Airplane air2) {
        int airLebgth = air.length - air2.length;
        if (airLebgth > 0) {
            System.out.println("Первый самолет длиннее");
        } else if (airLebgth == 0) {
            System.out.println("Длины самолетов равны");
        } else {
            System.out.println("Второй самолет длиннее");
        }
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year +
                ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public int fillUp(int n) {
        return fuel = fuel + n;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}


//1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
//        В классе Самолет реализовать статический метод compareAirplanes, который в качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.
