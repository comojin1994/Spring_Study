package example;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();

        for (int i = 0; i < row; i++){
            System.out.println(" ".repeat(row - i - 1) + "*".repeat(2 * i + 1));
        }
        for (int i = 0; i < row - 1; i++) {
            System.out.println(" ".repeat(i + 1) + "*".repeat(2 * (row - i - 2) + 1));
        }
    }
}
