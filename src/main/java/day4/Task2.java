package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] mass = new int[100];
        Random rand = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(10000);
        }

        int max = 0;
        int min = mass.length;
        int nullCount = 0;
        int summNullCount = 0;

        for (int m : mass
        ) {
            if(m > max){
                max = m;
            }
            if(m < min){
                min = m;
            }
            if(m % 10 == 0){
                nullCount = nullCount + 1;
            }
            if(m % 10 == 0){
                summNullCount = summNullCount + m;
            }
            System.out.print(m + " ");
        }
        System.out.println();
        System.out.println("Наибольший элемент массива - " + max);
        System.out.println("Наименьший элемент массива - " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0 - " + nullCount);
        System.out.println("Сумму элементов массива, оканчивающихся на 0 - " + summNullCount);
    }
}


//2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//        Затем, используя цикл for each вывести в консоль:
//        наибольший элемент массива
//        наименьший элемент массива
//        количество элементов массива, оканчивающихся на 0
//        сумму элементов массива, оканчивающихся на 0
//
//        Использовать сортировку запрещено.
