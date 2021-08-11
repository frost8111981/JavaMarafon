package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputMass = sc.nextInt();
        int[] mass = new int[inputMass];
        int i = 0;
        while (i < inputMass) {
            int count = sc.nextInt();
            mass[i] = count;
            i++;
        }

        int greater = 0;
        int equal = 0;
        int even = 0;
        int odd = 0;
        int summ = 0;
        for (int m : mass) {
            if(m > 8){
                greater = greater + 1;
            }
            if(m == 1){
                equal = equal + 1;
            }
            if(m % 2 == 0){
                even = even + 1;
            }
            if(m % 2 != 0){
                odd = odd + 1;
            }
            summ = summ + m;
            System.out.print(m + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(mass));
        System.out.println();

        System.out.println("Длина массива: " + mass.length);
        System.out.println("Количество чисел больше 8: " + greater);
        System.out.println("Количество чисел равных 1: " + equal);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + summ);

    }
}


//Доп. статьи:
//        Многомерные массивы
//        Генерация случайных чисел
//
//        *Обратите в статье особое внимание на способ создания пустого двумерного массива (int[][] x = new int[n][m])
//
//        Доп. информация:
//        Для того, чтобы вывести массив на экран, можно вручную перебрать все его элементы с помощью цикла, но удобнее использовать метод Arrays.toString(). Этот метод описан здесь: Метод Arrays.toString()
//        Оба варианта вывода массива на экран (вручную и с помощью Arrays.toString()) - правильные. Используйте любой из них.
//
//
//        Задачи:
//
//
//        1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
//        а) Длине массива
//        б) Количестве чисел больше 8
//        в) Количестве чисел равных 1
//        г) Количестве четных чисел
//        д) Количестве нечетных чисел
//        е) Сумме всех элементов массива
//
//        Пример:
//        Введено число 10. Сгенерирован следующий массив:
//        [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//
//        Информация о массиве:
//        Длина массива: 10
//        Количество чисел больше 8: 1
//        Количество чисел равных 1: 0
//        Количество четных чисел: 6
//        Количество нечетных чисел: 4
//        Сумма всех элементов массива: 46
