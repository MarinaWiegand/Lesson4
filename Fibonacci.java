package com.dmdev.Lesson4.HW2;

/**
 * написать программу, вычисляющую все числа Фибоначчи меньше введенного пользователем целого числа
 */
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число");
        int value = s.nextInt();
        int n1 = 1;
        int n2 = 1;
        int n;
        System.out.println(n1 + " ");
        System.out.println(n2 + " ");

        for (int i = 3; i <=value ; i++) {
            n = n1 + n2;
            n1 = n2;
            n2 = n;
            if (n <= value && n >= 0){
                System.out.println(n + " ");
            }

    }




    }
}
