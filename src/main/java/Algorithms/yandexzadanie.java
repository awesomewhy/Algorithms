package Algorithms;

import java.util.Scanner;

public class yandexzadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int day1 = scanner.nextInt();
        int hour1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int sec1 = scanner.nextInt();

        int year2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int day2 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int sec2 = scanner.nextInt();

        int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        int seconds = 0;

        for (int year = year1; year <= year2; year++) {
            int endMonth = (year == year2) ? month2 : 12;
            int startMonth = (year == year1) ? month1 : 1;

            for (int month = startMonth; month <= endMonth; month++) {
                int endDay = (year == year2 && month == month2) ? day2 : daysInMonth[month - 1];
                int startDay = (year == year1 && month == month1) ? day1 : 1;

                for (int day = startDay; day <= endDay; day++) {
                    if (year == year2 && month == month2 && day == day2) {
                        seconds += (hour2 * 3600 + min2 * 60 + sec2);
                    } else if (year == year1 && month == month1 && day == day1) {
                        seconds += (24 * 3600 - (hour1 * 3600 + min1 * 60 + sec1));
                    } else {
                        seconds += 24 * 3600;
                    }
                }
            }
        }

        days = seconds / (24 * 3600);
        seconds = seconds % (24 * 3600);

        System.out.println(days + " " + seconds);
    }
}
