package day6;

public class Motobike {
    int year;
    String color;
    String model;

    Motobike(String model, int year, String color){
        this.year = year;
        this.color = color;
        this.model = model;

    }

    void info (){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear){
        return Math.abs(inputYear - year);
    }
}
