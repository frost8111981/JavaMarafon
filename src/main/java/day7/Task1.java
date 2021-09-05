package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air = new Airplane("USA", 2000, 30, 600);
        Airplane air2 = new Airplane("Russia", 2000, 30, 700);

        Airplane.compareAirplanes(air,air2);

    }
}