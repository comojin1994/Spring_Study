package ifexample;

import java.util.Scanner;

public class SwitchCaseEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = 28;

        switch(month % 2){
            case 0: day = 30;
                break;
            case 1: day = 31;
                break;
        }
        day = (month==2)? 28: day;

        System.out.println(month + "월의 날짜수는 " + day + "입니다.");
    }
}
