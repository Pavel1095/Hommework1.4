import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    //  Задание 3
        int currentYear = 2022;

        int start = currentYear - 200;
        int end = currentYear + 100;

        for (int year = start;year < end; year ++) {
            if(year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}