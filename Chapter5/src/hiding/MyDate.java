package hiding;

public class MyDate {

    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public void showDate() {
        if (isValid) {
            System.out.println(year + "." + month + "." + day);
        } else {
            System.out.println("Error");
        }

    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }


}
