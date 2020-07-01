package hidingExample;

import java.util.Scanner;

public class MyDateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        MyDate mydate = new MyDate();
        mydate.setYear(year);
        mydate.setMonth(month);
        mydate.setDay(day);

        mydate.showDate();
        System.out.println(mydate.isValidShow());

    }
}
