package Cycle;

import java.util.Scanner;

public class Cycle3 {
    public static void main(String[] args) {
         /*НАПИШИТЕ ПРОГРАММУ КОТОРАЯ ПОЛУЧАЕТ ДВА ЦЕЛЫХ ЧИСЛА И НАХОДИТ ИХ ПРОИЗВЕДЕНИЕ,
         НЕ ИСПОЛЬЗУЯ ОПЕРАЦИЮ УМНОЖЕНИЯ. НО УЧТИТЕ МОГУТ БЫТЬ И ОТРИЦАТЕЛЬНЫЕ ЧИСЛА.
         ПРИМЕР: 10 И 15*/


        Scanner scanner = new Scanner(System.in);

         int a = scanner.nextInt();
         int b = scanner.nextInt();

         int sum = 0;
         int count = 0;

         while (count < Math.abs(b)) {
             sum = sum + Math.abs(a);
             count++;
         }
         if ((a < 0 && b > 0) || (b < 0 && a > 0)) {
             System.out.println("-" + sum);
         } else System.out.println(sum);
    }
}
