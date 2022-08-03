package Study;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("vvedite nazvanie predmeta");


//        Students students = new Students();
//        students.insertStudent(students);

        Subjects subjects = new Subjects();
        subjects.insertSubjects(subjects);

    }
}
