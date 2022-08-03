package Cycle;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;

        while (n >= 0) {
            n = n / 10;
            count++;
            System.out.println("-----");
        }
        System.out.println(count);
    }
}
