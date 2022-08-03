package SQL;

import Connect.Connection1;

import java.net.ConnectException;
import java.sql.Connection;
import java.util.Scanner;

public class MainSQL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection1 connection1 = new Connection1();
        Connection connect = connection1.connect();
    }
}
