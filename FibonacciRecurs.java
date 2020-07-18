package com.dmdev.Lesson4.HW2;

/**
 * написать программу, вычисляющую все числа Фибоначчи меньше введенного пользователем целого числа
 */
public class FibonacciRecurs {
    public static void main(String[] args) {
        int Fibonacci = Fibonacci(8);
        System.out.println();
        System.out.println(Fibonacci);

    }

    public static int Fibonacci(int value) {
        if (value <= 1) {
            return value;
        }
        return value = Fibonacci(value - 1) + Fibonacci(value - 2);


    }
}

