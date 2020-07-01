package hidingExample;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (this.month % 2 != 0){isValid = (day < 1 || day > 31)? false: true;}
        else {isValid = (day < 1 || day> 30)? false: true;}

        if (this.month == 2){
            if (this.year % 400 == 0){isValid = (day < 1 || day > 29)? false: true;}
            else if (this.year % 100 == 0){isValid = (day < 1 || day > 28)? false: true;}
            else if (this.year % 4 == 0){isValid = (day < 1 || day > 29)? false: true;}
            else {isValid = (day < 1 || day > 28)? false: true;}
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        isValid = (month < 1 || month > 12)? false: true;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        isValid = (year < 1)? false: true;
        this.year = year;
    }

    public void showDate(){
        if (isValid){System.out.println(year + "." + month + "." + day);}
        else {System.out.println("Not proper input");}
    }

    public String isValidShow(){
        if (this.isValid){return "Proper input";}
        else {return "Not Proper input";}
    }
}
