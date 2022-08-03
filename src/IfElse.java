import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        if (a >= b && a > c){
            System.out.println(a);
        }
        else if (b > a && b >= c){
            System.out.println(b);
        }
        else if (a == b && c == b){
            System.out.println("numbers are equal");
        }
        else {
            System.out.println(c);
        }
    }
}
