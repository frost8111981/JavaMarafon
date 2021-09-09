package day8;

public class Task1 {
    public static void main(String[] args) {
        String s = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            s = s + " " + i;
        }
        long stopTime = System.currentTimeMillis();
        System.out.println(s);
        System.out.println("Длительность работы, в мс.:" + (stopTime - startTime));


        System.out.println();
        System.out.println();


        StringBuilder sb = new StringBuilder("");
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            sb.append(i + " ");
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println(sb);
        System.out.println("Длительность работы, в мс.:" + (stopTime2 - startTime2));


    }
}


//День 8
//        Темы:
//        Урок 23: StringBuilder
//        Урок 23 (продолжение): Форматирование строк в Java
//        Урок 24: Класс Object и метод toString()
//
//        Доп.материалы - Как измерить время работы программы:
//        long startTime = System.currentTimeMillis(); //сохраняем время перед запуском блока кода
//        … // ваш код, время которого необходимо измерить
//        long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал
//        System.out.println(“Длительность работы, в мс.: “ + stopTime - startTime);
//
//
//
//        Задачи:
//
//        1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
//        После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:
//        0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
//
//        Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String) и использовании StringBuilder, реализуйте описанную задачу этими двумя способами, замеряя время работы программы.
