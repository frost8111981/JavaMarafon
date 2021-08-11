package day4;

import java.util.Random;


public class Task4 {
    public static void main(String[] args) {
        int[] mass = new int[100];
        Random rand = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(10000);
        }
        int maxSum = 0;
        int indexMaxSum = 0;
        for (int i = 0; i < mass.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum = sum + mass[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                indexMaxSum = i;
            }
        }

        System.out.println(maxSum);
        System.out.println(indexMaxSum);

//        int min;
//        for (int j = 0; j < mass.length; j++) {
//            for (int i = 0; i < mass.length - 1; i++) {
//                if (mass[i] > mass[i + 1]) {
//                    min = mass[i + 1];
//                    mass[i + 1] = mass[i];
//                    mass[i] = min;
//                }
//            }
//        }
//
//
//        for (int count : mass
//        ) {
//            System.out.println(count);
//        }
//        System.out.println();
//        int max;
//        for (int j = 0; j < mass.length; j++) {
//            for (int i = 0; i < mass.length - 1; i++) {
//                if (mass[i] < mass[i + 1]) {
//                    max = mass[i + 1];
//                    mass[i + 1] = mass[i];
//                    mass[i] = max;
//                }
//            }
//        }
//
//        for (int count : mass
//        ) {
//            System.out.println(count);
//        }


    }
}


//4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//        Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
//
//        Пример:
//        *Для простоты пример показан на массиве размера 10
//
//        [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]
//
//        Тройка с максимальной суммой: [8742, 1040, 3254]
//
//        Вывод в консоль:
//        13036
//        7
//
//        *Пояснение. Первое число - сумма тройки [8742, 1040, 3254]. Второе число - индекс первого элемента тройки, то есть индекс числа 8742.
