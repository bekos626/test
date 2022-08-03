package Cycle;

import java.util.Scanner;

public class Cycle2 {
    public static void main(String[] args) {

        /*Напишите программу, которая получает два целых числа А и Б (0 < А < Б)
        * и выводит квадраты всех натуральных чисел в интервале от А до Б
        * Пример: 10 и 12
        * 10 * 10 = 100
        * 11 * 11 = 121
        * 12 * 12 = 144*/

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        if (0 < a && b > 0 && b > a) {
            while (a <= b) {
                System.out.println(a + " * " + a + " = " +  (a * a));
                a++;
            }
        } else System.out.println("Sorry");

    }
}
