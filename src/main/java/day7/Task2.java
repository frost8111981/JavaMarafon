package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Player pl1 = new Player(80);
        Player pl2 = new Player(86);
        Player pl3 = new Player(90);
        pl1.info();


        Player pl4 = new Player(89);
        Player pl5 = new Player(81);
        Player pl6 = new Player(95);

        pl1.info();

        for(int i = 0; i < 80; i ++){
            pl1.run();
        }
        pl1.info();


    }
}



