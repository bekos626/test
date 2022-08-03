package Cycle;

public class Break {
    public static void main(String[] args) {


        int n = 100;
        while (n > 0) {
            if (n == 50) {
                break;
            }
            System.out.println(n);
            n--;
        }
    }
}
