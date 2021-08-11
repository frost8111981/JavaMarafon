package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int m = 3;
        int n = 3;
        int[][] mass = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = rand.nextInt(10);
            }
            System.out.println();
        }

        int index = 0;
        int indexSum = 0;
        int sumCicle = 0;

        for (int[] count : mass) {
            int sum = 0;
            for (int count1 : count) {
                System.out.print(count1 + " ");
                sum = sum + count1;
            }

            if (sum > sumCicle) {
                sumCicle = sum;
                index = indexSum;
            }
            System.out.println();
            indexSum = indexSum + 1;

        }

        System.out.println();
        System.out.println();
        System.out.println("максимальная сумма чисел в индексе - " + sumCicle);
        System.out.println("индекс строки, сумма чисел в которой максимальна - " + index);
    }
}


//3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам). В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких строк несколько, вывести индекс последней из них.
//        Пример сгенерированной матрицы (для простоты m=3, n=5):
//
//        3 2 1 5 7 	// сумма - 18
//        1 2 5 6 2 	// сумма - 16
//        3 4 9 6 4	// сумма - 26
//
//        Ответ: 2 (индекс строки, сумма чисел в которой максимальна)


//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(mass[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();