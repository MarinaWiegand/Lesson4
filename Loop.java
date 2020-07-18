package com.dmdev.Lesson4.HW3;
/**
 * Написать программу, отображающую статистику по осадкам
 * за N дней. N вводится пользователем.
 *     Пользователь также должен ввести N целых чисел, обозначающих
 * величину осадков в день.
 *     Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 *     Не использовать массивы!
 */

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество дней");
        int day = s.nextInt();

        Scanner n = new Scanner(System.in);
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < day; i++) {
            System.out.println("введите количество осадков в " + (i + 1) + " день");
            int precipitation = n.nextInt();
            sum = sum + precipitation;

            if (max < precipitation) {
                max = precipitation;
            }

        }
        double meanNum;
        meanNum = sum / day;

        System.out.println("a. Количество дней: " + day);
        System.out.println("b. Сумма осадков за этот период: " + sum);
        System.out.println("c. Среднее количество осадков за этот период: " + meanNum);
        System.out.println("d. Максимальное количество дневных осадков за этот период: " + max);
    }


}
