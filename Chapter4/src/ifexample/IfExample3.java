package ifexample;

import java.util.Scanner;

public class IfExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        char grade = 'F';

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        }

        System.out.println("score : " + score);
        System.out.println("grade : " + grade);

        int a = 10;
        int b = 20;
        int max;

        max = (a > b) ? a : b;
        System.out.println(max);
    }
}
