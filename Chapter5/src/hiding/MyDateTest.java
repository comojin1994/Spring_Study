package hiding;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date = new MyDate();

//        date.day = 100;
//        date.month = 70;
//        date.year = 2019;

        date.setDay(10);
        date.setMonth(7);
        date.setYear(2019);

        date.showDate();

        MyDate date2 = new MyDate();
        date2.setYear(2020);
    }
}
