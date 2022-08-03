package Cycle;

import java.util.Scanner;

public class Cycle4 {
    public static void main(String[] args) {

        /*Напишите программу которая будет получать числа до тех пор пока полученное число позитивное
        * Пример: 1
        *         1
        *        -1
        *         До свидания!*/


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a > 0) {
            System.out.println(a);
            a = sc.nextInt();
        }
        System.out.println("Bye");
    }
}
