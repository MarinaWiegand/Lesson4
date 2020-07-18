package com.dmdev.Lesson4.HW;
/**
 * Написать программу, вычисляющую сумму цифр введенного пользователем целого числа
 */

import java.util.Scanner;

public class HWLesson4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число");
        int value = s.nextInt();
        int result = sum(value);
        System.out.println("Сумма целого числа = " + result);
    }

    public static int sum(int value) {
        int result = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            result += currentValue % 10;
        }

        return result;
    }
}
