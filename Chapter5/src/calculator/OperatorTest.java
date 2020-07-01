package calculator;

import java.util.Scanner;

public class OperatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double m = input.nextDouble();

        Operator test = new Operator();

        System.out.println(test.sum(n, m));
        System.out.println(test.sub(n, m));
        System.out.println(test.mul(n, m));
        System.out.println(test.div(n, m));
    }
}
