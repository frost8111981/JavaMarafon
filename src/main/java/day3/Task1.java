package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            String input = sc.nextLine();
            switch (input) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн ":
                    System.out.println("Германия");
                    break;

                case "Stop":
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
            if (input.equals("Stop")) {
                break;
            }
        }

    }
}


//Доп. статьи:
//        Методы класса String: https://metanit.com/java/tutorial/7.2.php
//        Особое внимание обратите на раздел “Сравнение строк” и метод equals(). Этот метод понадобится вам. Строки в Java не должны сравниваться с помощью ==, а должны сравниваться с помощью метода equals().
//
//        Доп. информация по оператору switch:
//        1) В операторе switch, если код в блоках case совпадает, эти блоки можно объединить.
//        Пример: Мы хотим выводить в консоль слово “привет”, если пользователь ввел число 10, 20 или 30. В этом случае, оператор switch будет выглядеть следующим образом:
//
//
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        switch(number) {
//        case 10:
//        case 20:
//        case 30:
//        System.out.println("привет");
//        break;
//        }
//
//        2) В операторе switch также может использоваться команда default. Эта команда нужна для того, чтобы описать, что будет выполняться, если ни одно из вышеописанных условий не покажет совпадение.
//        Пример: Мы хотим выводить в консоль слово “привет”, если пользователь ввел число 10, 20 или 30. Но если пользователь ввел любое другое число, мы хотим выводить на экран слово “пока”.
//        Код оператора switch для этого:
//
//        switch(number) {
//        case 10:
//        case 20:
//        case 30:
//        System.out.println("привет");
//        break;
//default:
//        System.out.println("пока");
//        }
//
//        Доп. информация по ключевому слову break:
//        Ключевое слово break прерывает выполнение структур for, while и switch.
//        При этом, break прерывает только ту структуру, внутри которой он был вызван, но не прерывает внешние структуры.
//        Например, если один цикл for вложен внутрь другого цикла for:
//
//        for (int i = 0; i < 10; i++) {
//        for (int j = 0; j < 10; j++) {
//        System.out.print(j + " "); // выводим j на одной строке
//
//        if (j == 5)
//        break;
//        }
//
//        System.out.println(); // переходим на следующую строку
//        }
//
//        break, вызванный внутри вложенного цикла for прервет выполнение только этого вложенного цикла, а внешний цикл for будет работать.
//        Поэтому вывод вышеописанного кода будет следующим:
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//        0 1 2 3 4 5
//
//        Строк 10, то есть внешний цикл for отработал в полном размере, но столбцов только 6. Значит каждый раз внутренний цикл for прерывался из-за break.
//
//
//        Задачи:
//
//        1. Реализовать программу, которая в консоль выводит название страны, принимая на вход название города. Программа должна работать до тех пор, пока не будет введено слово “Stop”.
//        Реализовать, используя следующие данные:
//        Москва, Владивосток, Ростов - Россия
//        Рим, Милан, Турин - Италия
//        Ливерпуль, Манчестер, Лондон - Англия
//        Берлин, Мюнхен, Кёльн - Германия
//
//        При вводе любого другого города, вывести сообщение “Неизвестная страна”.
//
//        Пример:
//        Милан - ваш ввод в консоль
//        Италия - ответ программы
//        Дублин - ваш ввод в консоль
//        Неизвестная страна - ответ программы
//        Stop - ваш ввод в консоль
//        *программа завершила работу*