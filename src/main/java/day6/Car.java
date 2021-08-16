package day6;

public class Car {

    private int year;
    private String color;
    private String model;

    Car(String model, int year, String color) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {

        return Math.abs(inputYear - year);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
