package operator;

public class OperatorEx3 {
    public static void main(String[] args) {
        int score = 100;
        System.out.println(++score);
        System.out.println(score++);
        System.out.println(score);
        System.out.println(--score);
        System.out.println(score--);

        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(num1);
        System.out.println(i);

        System.out.println(value);

        value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
        System.out.println(num1);
        System.out.println(i);

        System.out.println(value);

        int num2 = 10;
        int num3 = 20;

        int num = (num2 > num3) ? num2 : num3;
        System.out.println(num);
    }
}
