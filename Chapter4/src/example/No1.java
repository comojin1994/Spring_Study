package example;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String operator = input.nextLine();
        String case_ = input.nextLine();
        int n = input.nextInt();
        int m = input.nextInt();
        double result = 0;

        if (case_.equals("if")) {
            if (operator.equals("+")) {
                result = n + m;
            } else if (operator.equals("-")) {
                result = n - m;
            } else if (operator.equals("*")) {
                result = n * m;
            } else if (operator.equals("/")) {
                result = (double) n / (double) m;
            } else {
                System.out.println("Error");
            }
        } else if (case_.equals("switch")) {
            switch (operator) {
                case "+":
                    result = n + m;
                    break;
                case "-":
                    result = n - m;
                    break;
                case "*":
                    result = n * m;
                    break;
                case "/":
                    result = (double) n / (double) m;
                    break;
                default:
                    System.out.println("Error");
            }
        }
        System.out.println(Integer.toString(n) + " " + operator + " " + Integer.toString(m) + " = " + Double.toString(result));

    }
}
